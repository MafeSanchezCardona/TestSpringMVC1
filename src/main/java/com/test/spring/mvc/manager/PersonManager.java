package com.test.spring.mvc.manager;

import com.test.spring.mvc.domain.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonManager {

    private List<Person> personList = new ArrayList<>();

    public void add(Person person) {
        personList.add(person);
    }

    public void delete(Person person) {

        Person personFind = get(person);
        personList.remove(personFind);
    }

    public Person get(Person person) {

        Person personReturn = personList.stream()
                .filter(personFilter -> (person.getName().equals(personFilter.getName()) && person.getLastName().equals(personFilter.getLastName())))
                .findAny()
                .orElse(null);

        return personReturn;
    }

    public List<Person> listPerson() {
        return personList;
    }
}
