package com.example.location.entity;

import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.swing.text.View;

@Entity
@Table(name="ip2location_db5")
public class IpLocation {
     IpLocation() {
    }
    @Id
private Integer ip_from;
private Integer ip_to;

@Column(name = "country_name")
private String countryName;
@Column(name = "region_name")
private String regionName;
@Column(name = "city_name")
private String cityName;
private Double latitude;
private Double longitude;
@Column(name = "country_code")
private String countryCode;

    /** add getter and setter*/

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

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
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
