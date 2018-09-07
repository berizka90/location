package com.example.location.repository;

import com.example.location.entity.IpLocation;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

import static com.example.location.repository.SqlStatmentConstant.SELECT_FROM_TO_ID;

public interface IpLocationRepo extends CrudRepository<IpLocation,Integer> {
    @Query(value = SELECT_FROM_TO_ID,
            nativeQuery=true)
     Optional<IpLocation> findIpFromTo( @Param("base") Integer fr);


}
