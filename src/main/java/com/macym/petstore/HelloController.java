package com.macym.petstore;

import com.macymoo.petstore.client.api.PetApi;
import com.macymoo.petstore.client.model.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private PetApi petApi;

    @RequestMapping("/pets")
    public List<Pet> findAvailablePets() {
        return petApi.findPetsByStatus(Arrays.asList("available"));
    }

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}