package org.anitab.spring.home_sweet_hunt.models;

import java.util.ArrayList;
import java.util.List;

public class MVPApartment {
    private int apartmentId;
    private Address address;
    private String url;
    private int bedrooms;
    private double bathrooms;
    private int price;
    private boolean dogFriendly;
    private boolean parking;
    private boolean favorite;
    private List<String> photos = new ArrayList<>();
    private UtilitiesDetails utilities;

    public MVPApartment(int bedrooms, double bathrooms, int price, Address address){
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        this.price = price;
        this.address = address;
    }
    
    public int getApartmentId() {return apartmentId;}   
    public void setApartmentId(int apartmentId) {this.apartmentId = apartmentId;}

    public Address getAddress() {return address;}
    public void setAddress(Address address) {this.address = address;}   

    public String getUrl() {return url;}
    public void setUrl(String url) {this.url = url;}

    public int getBedrooms() {return bedrooms;}
    public void setBedrooms(int bedrooms) {this.bedrooms = bedrooms;}

    public double getBathrooms() {return bathrooms;}
    public void setBathrooms(double bathrooms) {this.bathrooms = bathrooms;} 

    public int getPrice() {return price;}
    public void setPrice(int price) {this.price = price;}   

    public boolean isDogFriendly() {return dogFriendly;}
    public void setDogFriendly(boolean dogFriendly) {this.dogFriendly = dogFriendly;}   

    public boolean isParking() {return parking;}    
    public void setParking(boolean parking) {this.parking = parking;}   

    public boolean isFavorite() {return favorite;}  
    public void setFavorite(boolean favorite) {this.favorite = favorite;}   

    public List<String> getPhotos() {return photos;}
    public void setPhotos(List<String> photos) {this.photos = photos;}  

    public UtilitiesDetails getUtilities() {return utilities;}  
    public void setUtilities(UtilitiesDetails utilities) {this.utilities = utilities;}
    
     @Override
    public String toString() {
        return "MVPApartment{" +
                "apartmentId=" + apartmentId +
                ", address=" + address +
                ", url='" + url + '\'' +
                ", bedrooms=" + bedrooms +
                ", bathrooms=" + bathrooms +
                ", price=" + price +
                ", dogFriendly=" + dogFriendly +
                ", parking=" + parking +
                ", favorite=" + favorite +
                ", photos=" + photos +
                ", utilities=" + utilities +
                '}';     
}        
}
