package com.test.spring.mvc;

import com.test.spring.mvc.domain.Address;
import com.test.spring.mvc.domain.Person;
import com.test.spring.mvc.manager.PersonManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.List;

public class PersonTest {

    private PersonManager personManager;
    private Person person;

    @Before
    public void  init() {
        personManager = new PersonManager();

        Address address = new Address();
        address.setStreet("Calle 20");
        address.setApartment(1753);
        address.setNumber("12-30");

        person = new Person("Daniela", "Suarez", 23, new Date(), address);

        personManager.add(person);
    }

    @Test
    public void addTest() {

        Address address = new Address();
        address.setStreet("Calle 34");
        address.setApartment(1201);
        address.setNumber("34-30");

        Person person = new Person("Laura", "Perez", 23, new Date(), address);

        personManager.add(person);

        Person personFind = personManager.get(person);

        Assert.assertNotNull(personFind);
        Assert.assertEquals(personFind, person);

    }

    @Test
    public void removeTest() {

        personManager.delete(person);

        List<Person> personList = personManager.listPerson();

        Assert.assertEquals(personList.size(), 0);

    }

    @Test
    public void getTest() {

        Person personFind = personManager.get(person);

        Assert.assertNotNull(personFind);
        Assert.assertEquals(personFind, person);

    }


}
