package com.example.location.entity;

import java.util.Optional;

public class Representation  {
    private String IP4;
    private String Ip4Cunonical;
    private String countryCode;

    private String contryName;
    private String regionName;

    private String cityName;
    private Double latitude;
    private Double longitude;

    Representation(String IP4, String ip4Cunonical, Optional<IpLocation> ip) {
        cityName=ip.get().getCityName();
        this.IP4=IP4;
        this.Ip4Cunonical=ip4Cunonical;
        this.countryCode=ip.get().getCountryCode();
        this.regionName=ip.get().getRegionName();
        this.latitude=ip.get().getLatitude();
        this.longitude=ip.get().getLongitude();
        this.contryName=ip.get().getCountryCode();
        this.cityName=ip.get().getCityName();

    }

    /** add getter and setter*/

    public String getIP4() {
        return IP4;
    }

    public void setIP4(String IP4) {
        this.IP4 = IP4;
    }

    public String getIp4Cunonical() {
        return Ip4Cunonical;
    }

    public void setIp4Cunonical(String ip4Cunonical) {
        Ip4Cunonical = ip4Cunonical;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getContryName() {
        return contryName;
    }

    public void setContryName(String contryName) {
        this.contryName = contryName;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

}
