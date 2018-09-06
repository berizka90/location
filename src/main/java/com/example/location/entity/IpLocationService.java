package com.example.location.entity;

import com.example.location.repository.IpLocationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class IpLocationService {
    @Autowired
    private IpLocationRepo ipLocationRepo;
  private   List<IpLocation> list=new ArrayList<>(Arrays.asList(new IpLocation(),new IpLocation()));

    public List<IpLocation> getAllList() {
        List<IpLocation> list=new ArrayList<>();
        ipLocationRepo.findAll()
        .forEach(list::add);
        return list;
    }

    public Representation getIploc(String ip){

        Integer ip4= Integer.parseInt(ip.replaceAll("\\.", ""));
        Optional<IpLocation> location=ipLocationRepo.findIpFromTo(ip4);
        Representation rep=new Representation(ip4.toString(),ip,location);
      return  rep;
    }
}
