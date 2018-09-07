package com.example.location.repository;

public interface SqlStatmentConstant {
    String SELECT_FROM_TO_ID="SELECT * FROM ip2location_db5 t where t.ip_from <=:base  AND t.ip_to>:base";
}
