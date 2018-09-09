package com.example.location.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Optional;
@Setter
@Getter
public class Representation {
    private String IP4;
    private String Ip4Cunonical;
    private String countryCode;

    private String contryName;
    private String regionName;

    private String cityName;
    private Double latitude;
    private Double longitude;

    /**
     * This is wrapper that return data from database in appropriate view
     */
    Representation(String IP4, String ip4Cunonical, Optional<IpLocation> ip) {
        this.IP4 = IP4;
        this.Ip4Cunonical = ip4Cunonical;
        ip.ifPresent(city -> setCityName(city.getCityName()));
        ip.ifPresent(country -> setCountryCode(country.getCountryCode()));
        ip.ifPresent(region -> setRegionName(region.getRegionName()));
        ip.ifPresent(latitude -> setLatitude(latitude.getLatitude()));
        ip.ifPresent(longitude -> setLongitude(longitude.getLongitude()));
        ip.ifPresent(country -> setContryName(country.getCountryName()));
    }



}
