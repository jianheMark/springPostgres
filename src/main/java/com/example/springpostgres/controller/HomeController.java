package com.example.springpostgres.controller;


import com.example.springpostgres.entities.City;
import com.example.springpostgres.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {
    @Autowired
    CityService cityService;

    @GetMapping("sayhello")
    public String sayHello(){
        return "Hello User";
    }

    @GetMapping("getcities")
    public List<City> getCities(){
        return cityService.getCities();
    }
    @PostMapping("addcity")
    public void SaveCity(@RequestBody City city){
        cityService.saveCity(city);
    }

    @GetMapping("getcity")
    public City getcity(String cityname){
        return cityService.getCity(cityname);
    }





}
