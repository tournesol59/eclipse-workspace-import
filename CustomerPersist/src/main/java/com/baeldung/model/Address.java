package com.baeldung.model;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Component;

@Component
public class Address {
    private int addressId;
    private String cityName;
    private String countryName;

    // the customer has many-to-one relationship with address (after we can code a Set with unique member in Customer

    public Address() {
        super();
    }

    public Address(int id, String city, String country) {
        super();
	this.addressId = id;
	this.cityName = city;
	this.countryName = country;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String city) {
        this.cityName = city;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String country) {
        this.countryName = country;
    }

    public void test() {
        System.out.println(cityName+" "+countryName);
    }

 }

