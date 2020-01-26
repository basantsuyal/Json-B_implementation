package com.person;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.json.bind.annotation.JsonbDateFormat;
import javax.json.bind.annotation.JsonbNumberFormat;
import javax.json.bind.annotation.JsonbProperty;
import javax.json.bind.annotation.JsonbTransient;

public class Person {

    public Person(int id, String name, String email, int age, LocalDate registeredDate, BigDecimal salary) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.age = age;
	this.registeredDate = registeredDate;
	this.salary = salary;
    }

    public int id;

    @JsonbProperty("person-name")
    public String name;

    @JsonbProperty(nillable = true)
    public String email;

    @JsonbTransient
    public int age;

    @JsonbDateFormat("dd-MM-yyyy")
    public LocalDate registeredDate;

    public BigDecimal salary;

    @JsonbNumberFormat(locale = "en_US", value = "#0.0")
    public BigDecimal getSalary() {
	return salary;
    }
}
