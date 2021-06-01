package com.example.petshop.controllers;

import com.example.petshop.models.Pet;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "/pet")
public class PetController {
    List<Map<Integer,String>> pets = new ArrayList<>();

    @GetMapping(path = "/{petId}")
    public ResponseEntity<Pet> petsShow(@RequestBody Pet pet, @PathVariable Integer petId){
        if (petId.equals(pet.getId())) throw new RuntimeException();
        return new ResponseEntity(pet, HttpStatus.OK);
    }

//    @PostMapping(path = "/{petId}")
//    public ResponseEntity<Pet> petUpdate(@RequestBody Pet pet, @PathVariable Integer petId){
//        if ()
//    }

//    @DeleteMapping(path = "/{petId}")
//    public RequestEntity<Pet> petDelete (@RequestBody Pet pet, @PathVariable Integer petId){
//        if (petId.contains(petId)) throw new RuntimeException();
//        pets.remove(petId);
//        return new ResponseEntity(pet, HttpStatus.OK);
//    }

    @PostMapping
    public ResponseEntity<Pet> pets(@RequestBody Pet pet){
        if (pets.contains(pet)) throw new RuntimeException();
        pets.add(pet);
        return new ResponseEntity(pet, HttpStatus.OK);
    }

//    @PutMapping
//    public ResponseEntity<Pet> petsNewUpdate (@RequestBody Pet pet){
//
//    }

    @GetMapping(path = "/findByStatus")
    public ResponseEntity<Pet> petStatus (@RequestBody Pet pet){
        if (pets.contains(pet)) throw new RuntimeException();
        pet.getStatus();
        return new ResponseEntity(pet, HttpStatus.OK);
    }
}
