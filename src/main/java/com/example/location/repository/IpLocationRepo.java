package com.example.location.repository;

import com.example.location.entity.IpLocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface IpLocationRepo extends CrudRepository<IpLocation,Integer> {
    //getAllLocation()
    //getLocation(String id)


}
