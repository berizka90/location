package com.example.location.entity;

import com.example.location.exception.NotApropriateFormatExeption;
import com.example.location.exception.NotSuchIpV4InDatabase;
import com.example.location.repository.IpLocationRepo;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


import java.util.ArrayList;

import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.example.location.entity.RegexConstant.REGEX;
import static com.example.location.entity.RegexConstant.REG_POINT;

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
  @ExceptionHandler(Exception.class)
    public Representation getIploc(String ip) throws NotApropriateFormatExeption, NotSuchIpV4InDatabase {
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(ip);
        if (!matcher.find()) {
            throw new NotApropriateFormatExeption(HttpStatus.BAD_REQUEST);
        }
        Long ip4 = getIpfromString(ip);

        Optional<IpLocation> location = ipLocationRepo.findIpFromTo(ip4);
        if (!location.isPresent()) {
            throw new NotSuchIpV4InDatabase();
        }
        return new Representation(ip4.toString(), ip, location);
    }

    /**
     * parse String representation of ip to Integer
     */
    private Long getIpfromString(String ip) {

        String[] bytes = ip.split(REG_POINT);
        int i = 0;
        long[] ipfromSt = new long[4];
        for (String by : bytes) {
            ipfromSt[i] = Integer.parseInt(by);
            i++;
        }
        return ipfromSt[0] * parser( 3) + ipfromSt[1] * parser( 2)
                + ipfromSt[2] * parser(1) + ipfromSt[3];
    }

    private Long parser( long n) {
        final long multi=256;
        long res = 256;
        for (int i = 0; i < n-1; i++) {
            res *= multi;
        }
        return res;
    }
}

