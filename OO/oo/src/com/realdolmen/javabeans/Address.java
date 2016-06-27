package com.realdolmen.javabeans;

/**
 * Created by stannisbaratheon on 03/06/16.
 */
public class Address {

    private String street;
    private String number;
    private String postalCode;
    private String city;
    private String country;
    private Boolean active;


    public Address () {
        this("Villagestreet","12","A3455","Nibelheim","New Yevon", true);
    }

    public Address (String street, String number, String postalCode, String city, String country, Boolean active) {
        this.street = street;
        this.number = number;
        this.postalCode= postalCode;
        this.city=city;
        this.country=country;
        this.active=active;

    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getAddressLine () {
        return this.street + " " + this.number + "\n" + this.postalCode + " " + this.city + "\n" + this.country;

    }



}
