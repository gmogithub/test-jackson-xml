package com.example.testxml.controller;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
public class Cities {

    @JacksonXmlProperty(localName = "ville")
    @JacksonXmlElementWrapper( useWrapping = false)
    private ArrayList<City> cities = new ArrayList<>();

    public ArrayList<City> getCities() {
        return cities;
    }

    public void setCities(ArrayList<City> cities) {
        this.cities = cities;
    }

    public void addCity(City city) {
        cities.add(city);
    }
}
