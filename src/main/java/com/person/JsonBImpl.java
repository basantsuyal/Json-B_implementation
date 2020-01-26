package com.person;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;

public class JsonBImpl {

    public static void main(String[] args) {

	// Create Object
	Person person = new Person(1, "Basant", "basant@test.com", 20, LocalDate.of(2019, 9, 7),
		BigDecimal.valueOf(10000000));

	// Create JsonB class Object
	Jsonb jsonb = JsonbBuilder.create();

	// Convert Object into JSON String
	String jsonPerson = jsonb.toJson(person);

	// Print on-screen
	System.out.println(jsonPerson);

    }

}
