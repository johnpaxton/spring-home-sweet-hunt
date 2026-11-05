package org.anitab.spring.home_sweet_hunt.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.ArrayList;

import org.anitab.spring.home_sweet_hunt.models.MVPApartment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.DeleteMapping;

@RestController
@RequestMapping("/home") 
public class ApartmentController {

    private final List<MVPApartment> apartments = new ArrayList<>();

    public ApartmentController() {
    MVPApartment apartment1 = new MVPApartment(2, 1.5, 2500, null);
        apartment1.setApartmentId(1);

        MVPApartment apartment2 = new MVPApartment(1, 1.0, 1800, null);
        apartment2.setApartmentId(2);

        MVPApartment apartment3 = new MVPApartment(3, 2.0, 3200, null);
        apartment3.setApartmentId(3);

        apartments.add(apartment1);
        apartments.add(apartment2);
        apartments.add(apartment3);
    }

    //getAllApartments -- Gabo
    @GetMapping
    public List<MVPApartment> getAllApartments() {
        return new ArrayList<>(apartments);
    }

    //createApartment  -- assigned to Tracy
    @PostMapping("/add-new-apartment")
    public ResponseEntity<MVPApartment> addNewApartment(
        @RequestParam("bedrooms") int bedrooms, 
        @RequestParam("bathrooms") double bathrooms, 
        @RequestParam("price") int price, 
        @RequestParam("street") String street,
        @RequestParam("city") String city,
        @RequestParam("state") String state,
        @RequestParam("zipCode") String zipCode
        ) {
            
            // Address address = new Address(street, city, state, zipCode);
            MVPApartment savedApartment = new MVPApartment(bedrooms, bathrooms, price, null);
            
                //give it an ID
                savedApartment.setApartmentId(apartments.size()+1); 
                //save is to the list
                apartments.add(savedApartment);

                return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(savedApartment);

        }

    //getApartmentById -- Viola to Do
    //Handles GET /home/{id}, for example /home/1 
    //Returns one apartment if the ID exists, if the ID does not exist, it will return a 404
    @GetMapping("/{id}")
        public ResponseEntity<MVPApartment> getApartmentById(@PathVariable int id) {
            //@PathVariable takes the number from the URL and puts it in the "id"
            
            //Look at each apartment in the list, one at a time
            for (MVPApartment apt: apartments) {

                //If this apartment's ID mathches
                if (apt.getApartmentId() == id) {
                    //return a 200 OK status
                    return ResponseEntity.ok(apt);
                }
            }
            //All apartments were checked and none matched
            //return a 404 Not Found
            //return ResponseEntity.notFound().build(); -- removed this to have consistent endpoints
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Apartment " + id + " not found");
        }
        
    
    

    //deleteApartmentById Gabo
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteApartment(@PathVariable int id){
        MVPApartment apartment = apartments.stream()
        .filter(p -> p.getApartmentId() == id)
        .findFirst()
        .orElseThrow(() -> new ResponseStatusException(
            HttpStatus.NOT_FOUND, "Apartment not found"
        ));
        apartments.remove(apartment);

        return ResponseEntity.noContent().build();
    }
    
}
