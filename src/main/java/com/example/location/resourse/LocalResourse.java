package com.example.location.resourse;

import com.example.location.entity.IpLocation;
import com.example.location.entity.IpLocationService;
import com.example.location.entity.Representation;
import com.example.location.exception.NotApropriateFormatExeption;
import com.example.location.exception.NotSuchIpV4InDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@ControllerAdvice
@RestController
public class LocalResourse  {

    @Autowired
    private IpLocationService locationService;

    @RequestMapping("/geoip")
    public List<IpLocation> getAll() {
        return locationService.getAllList();
    }

    @RequestMapping(value = "/geoip/{ip}", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Representation getIpV4(@PathVariable String ip)
            throws NotApropriateFormatExeption, NotSuchIpV4InDatabase {
        return locationService.getIploc(ip);
    }


}
