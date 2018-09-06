package com.example.location.resourse;

import com.example.location.entity.IpLocation;
import com.example.location.entity.IpLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;


@RestController
public class LocalResourse {
    @Autowired
    private IpLocationService locationService;

@RequestMapping("/geoip")
    public List<IpLocation> sayHy(){
    return locationService.getAllList();
}
@RequestMapping("/geoip/{ip}")
public Optional<IpLocation> getIpV4(@PathVariable String ip){
    return locationService.getIploc(ip);

}


}
