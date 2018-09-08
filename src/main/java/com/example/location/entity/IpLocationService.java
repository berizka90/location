package com.example.location.entity;

import com.example.location.exception.NotApropriateFormatExeption;
import com.example.location.exception.NotSuchIpV4InDatabase;
import com.example.location.repository.IpLocationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;

import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.example.location.entity.RegexConstant.REGEX;

@Service
public class IpLocationService {
    @Autowired
    private IpLocationRepo ipLocationRepo;

    public List<IpLocation> getAllList() {
        List<IpLocation> list = new ArrayList<>();
        ipLocationRepo.findAll()
                .forEach(list::add);
        return list;
    }

    /**
     * get String as request parameter parse
     *
     * @return Representation result from database in Json format
     */
    public Representation getIploc(String ip) throws NotApropriateFormatExeption, NotSuchIpV4InDatabase {
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(ip);
        if (!matcher.find()) {
            throw new NotApropriateFormatExeption();
        }
        Long ip4 = getIpfromString(ip);

        Optional<IpLocation> location = ipLocationRepo.findIpFromTo(ip4);
        if (!location.isPresent()){
            throw new NotSuchIpV4InDatabase();
        }
        return new Representation(ip4.toString(), ip, location);
    }

    /**
     * parse String representation of ip to Integer
     */
    private Long getIpfromString(String ip) {
        Long result;
        String[] bytes = ip.split("\\.");
        int i = 0;
        long[] ipfromSt = new long[4];
        for (String by : bytes) {
            ipfromSt[i] = Integer.parseInt(by);//Exception in this line
            i++;
        }
        result = ipfromSt[0] * 256 * 256 * 256 + ipfromSt[1] * 256 * 256 + ipfromSt[2] * 256 + ipfromSt[3];
        return result;
    }


}

