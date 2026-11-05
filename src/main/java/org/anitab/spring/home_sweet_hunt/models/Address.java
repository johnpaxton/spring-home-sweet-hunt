package org.anitab.spring.home_sweet_hunt.models;

public class Address {
    private String street;
    private String aptNumber;
    private String city;
    private String state;
    private String zipCode;

    public Address(String street, String aptNumber, String city,
                   String state, String zipCode) {
        this.street = street;
        this.aptNumber = aptNumber;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public String getAptNumber() {
        return aptNumber;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }

    @Override
    public String toString() {
        String aptText = "";

        if(aptNumber != null && !aptNumber.isEmpty()) {
            aptText = ", Apt " + aptNumber;
        }
        return street + aptText + ", " + city + ", " + state + ", " + zipCode;
    }
}
