package com.example.location.entity;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class IpLocationService {
  private   List<IpLocation> list=new ArrayList<>(Arrays.asList(new IpLocation(),new IpLocation()));

    public List<IpLocation> getAllList() {
        return list;
    }
    public IpLocation getIploc(String ip){
        String ip4= ip.replaceAll("\\.", "");
      return   list.stream().filter(t->t.getIPv4().equals(ip4)).findFirst().get();
    }
}
