package com.example.testxml.controller;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
public class Cities {

    @JacksonXmlProperty(localName = "ville")
    @JacksonXmlElementWrapper( useWrapping = false)
    private ArrayList<City> cities = new ArrayList<>();

    @JacksonXmlProperty(localName = "Tro")
    private String toto;

    @JacksonXmlProperty(localName = "Tro")
    private String tutu;

    public String getToto() {
        return toto;
    }

    public void setToto(String toto) {
        this.toto = toto;
    }

    public String getTutu() {
        return tutu;
    }

    public void setTutu(String tutu) {
        this.tutu = tutu;
    }

    private Parent z;

    private Parent l;

    public Parent getZ() {
        return z;
    }

    public void setZ(Parent z) {
        this.z = z;
    }

    public Parent getL() {
        return l;
    }

    public void setL(Parent l) {
        this.l = l;
    }

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
