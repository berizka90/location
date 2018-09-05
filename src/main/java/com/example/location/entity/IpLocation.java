package com.example.location.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


public class IpLocation {

    private String canonicalIPv4Representation="677.899.1.7";

    private String IPv4="67789917";

    private String cityName="Mountain View";

    private String countryCode="US";

    private String countryName="United States";

    private String regionName="California";

    private Double latitude=37.405992;

    private Double longitude=-122.078515;

     IpLocation() {
    }



/** add getter and setter*/
   String getIPv4() {
        return IPv4;
    }

    public void setIPv4(String IPv4) {
        this.IPv4 = IPv4;
    }

    public String getCanonicalIPv4Representation() {
        return canonicalIPv4Representation;
    }

    public void setCanonicalIPv4Representation(String canonicalIPv4Representation) {
        this.canonicalIPv4Representation = canonicalIPv4Representation;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
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
