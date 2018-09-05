package com.example.location.resourse;

import com.example.location.entity.IpLocation;
import com.example.location.entity.IpLocationService;
import com.example.location.repository.IpLocationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;


@RestController
public class LocalResourse {
    @Autowired
    private IpLocationService locationService;

@RequestMapping("/geoip")
    public List<IpLocation> sayHy(){
    return locationService.getAllList();
}
@RequestMapping("/geoip/{ip}")
public IpLocation getIpV4(@PathVariable String ip){
    return locationService.getIploc(ip);

}


}
