package com.test.spring.mvc.domain;

import org.springframework.context.annotation.Scope;

import java.util.Date;

@Scope("prototype")
public class Person {

    private String name;
    private String lastName;
    private Integer age;
    private Date birthdate;
    private Address address;

    public Person(String name, String lastName, Integer age, Date birthdate, Address address) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.birthdate = birthdate;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
}
