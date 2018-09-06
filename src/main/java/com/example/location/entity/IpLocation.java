package com.example.location.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ip2location_db5")
public class IpLocation {
//
//    private String canonicalIPv4Representation="677.899.1.7";
//
//    private String IPv4="67789917";
//
//    private String cityName="Mountain View";
//
//    private String countryCode="US";
//
//    private String countryName="United States";
//
//    private String regionName="California";
//
//    private Double latitude=37.405992;
//
//    private Double longitude=-122.078515;

     IpLocation() {
    }
    @Id
private Integer ip_from;
private Integer ip_to;
private String country_code;
private String country_name;
private String region_name;
private String city_name;
private Double latitude;
private Double longitude;


    public Integer getIp_from() {
        return ip_from;
    }

    public void setIp_from(Integer ip_from) {
        this.ip_from = ip_from;
    }

    public Integer getIp_to() {
        return ip_to;
    }

    public void setIp_to(Integer ip_to) {
        this.ip_to = ip_to;
    }

    public String getCountry_code() {
        return country_code;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public String getRegion_name() {
        return region_name;
    }

    public void setRegion_name(String region_name) {
        this.region_name = region_name;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    /** add getter and setter*/



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
