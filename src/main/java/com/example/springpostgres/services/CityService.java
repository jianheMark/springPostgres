package com.example.springpostgres.services;


import com.example.springpostgres.entities.City;
import com.example.springpostgres.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {
    @Autowired
    CityRepository repo;

    public CityService(){

    }

    public List<City> getCities(){
        return repo.findAll();
    }

    public City saveCity(City city) {
         return repo.save(city);
    }

    public City getCity(String cityname) {
        return repo.findByCityname(cityname);
    }
}
