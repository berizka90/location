package entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class IpLocation {
    private Integer IPv4;
    private String canonicalIPv4Representation;
    @Column(name = "city_name")
    private String cityName;
    @Column (name = "country_code")
    private String countryCode;
    @Column (name = "country_name" )
    private String countryName;
    @Column (name = "region_name")
    private String regionName;
    @Column (name = "latitude")
    private Double latitude;
    @Column (name = "longitude")
    private Double longitude;

    public IpLocation() {
    }

/** add getter and setter*/
    public Integer getIPv4() {
        return IPv4;
    }

    public void setIPv4(Integer IPv4) {
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
