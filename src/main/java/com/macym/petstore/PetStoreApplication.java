package com.macym.petstore;

import com.macymoo.petstore.client.api.PetApi;
import com.macymoo.petstore.client.model.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import java.util.Arrays;
import java.util.List;


@SpringBootApplication
@Import(PetStoreIntegrationConfig.class)
public class PetStoreApplication {


	public static void main(String[] args) throws Exception {
		SpringApplication.run(PetStoreApplication.class, args);


	}
}

