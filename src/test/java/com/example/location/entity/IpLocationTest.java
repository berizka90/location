package com.example.location.entity;

import com.example.location.LocationApplication;
import com.example.location.repository.IpLocationRepo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import java.util.Optional;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = LocationApplication.class,
        loader = AnnotationConfigContextLoader.class)
public class IpLocationTest {
    @Autowired IpLocationRepo locationRepo;

    @Test
    public void givebyId(){

    }

}