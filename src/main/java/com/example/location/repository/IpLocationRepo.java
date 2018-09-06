package com.example.location.repository;

import com.example.location.entity.IpLocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface IpLocationRepo extends CrudRepository<IpLocation,Integer> {
    @Query(value = "SELECT * FROM ip2location_db5 t where t.ip_from <=? AND t.ip_to>=?",
            nativeQuery=true)
    public Optional<IpLocation> findIpFromTo(Integer title, Integer to);


}
