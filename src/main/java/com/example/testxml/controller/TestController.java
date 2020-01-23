package com.example.testxml.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping(value = "/test", produces = MediaType.APPLICATION_XML_VALUE)
    public Root getTest() {
        Root root = new Root("greg", "000021545");
        Cities cities = new Cities();
        root.setCities(cities);
        cities.addCity(new City("Paris", "PARIS"));
        cities.addCity(new City("Marseille", "MARSEILLE"));
        cities.addCity(new City("Lyon", "LYON"));
        return root;
    }

    @GetMapping(value = "/root2", produces = MediaType.APPLICATION_XML_VALUE)
    public Root2 getRoot2() {
        Root2 root = new Root2();
        root.addCity(new City("Paris", "PARIS"));
        root.addCity(new City("Marseille", "MARSEILLE"));
        root.addCity(new City("Lyon", "LYON"));
        return root;
    }
}
