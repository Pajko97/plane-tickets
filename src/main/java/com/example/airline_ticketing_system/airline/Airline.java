package com.example.airline_ticketing_system.airline;


public class Airline {
    private Long id;
    private String country;
    private String name;
    private Short short_name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Short getShort_name() {
        return short_name;
    }

    public void setShort_name(Short short_name) {
        this.short_name = short_name;
    }

    public Airline(Long id, String country, String name, Short short_name) {
        this.id = id;
        this.country = country;
        this.name = name;
        this.short_name = short_name;
    }




}
