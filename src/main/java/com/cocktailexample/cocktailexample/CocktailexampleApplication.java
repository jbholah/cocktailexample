package com.cocktailexample.cocktailexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CocktailexampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(CocktailexampleApplication.class, args);
	}

	@CrossOrigin("http://localhost:8080")
	@GetMapping("/customRoute")
	public String myresponse() {
		cocktail longisland = new cocktail("Long Island", "alcoholic");
		return longisland.toString();
	}
}