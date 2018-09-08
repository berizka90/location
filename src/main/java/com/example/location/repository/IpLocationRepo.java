package com.example.location.repository;

import com.example.location.entity.IpLocation;
import com.example.location.exception.NotSuchIpV4InDatabase;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

import static com.example.location.repository.SqlStatmentConstant.SELECT_FROM_TO_ID;

public interface IpLocationRepo extends CrudRepository<IpLocation, Long> {
    @Query(value = SELECT_FROM_TO_ID,
            nativeQuery = true)
    Optional<IpLocation> findIpFromTo(@Param("base") Long fr) throws NotSuchIpV4InDatabase;


}
