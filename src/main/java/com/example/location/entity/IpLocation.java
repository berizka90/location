package com.example.location.entity;



import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "ip2location_db5")
public class IpLocation {
    IpLocation() {
    }

    @Id
    private Long ip_from;
    private Long ip_to;

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

}
