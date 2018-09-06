package com.example.location.repository;

import com.example.location.entity.IpLocation;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface IpLocationRepo extends CrudRepository<IpLocation,Integer> {
    @Query(value = "SELECT * FROM ip2location_db5 t where t.ip_from <=:frim  AND t.ip_to>:frim",
            nativeQuery=true)
     Optional<IpLocation> findIpFromTo( @Param("frim") Integer fr);


}
