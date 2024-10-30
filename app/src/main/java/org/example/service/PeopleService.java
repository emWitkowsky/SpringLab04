package org.example.service;

import org.example.domain.Person;
import org.example.domain.PersonCSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PeopleService {

//    private List<Person> people = new ArrayList<>();

//    public PeopleService() {};

    public List<Person> loadPeopleFromCSV(String filePath) {
        List<Person> people = new ArrayList<>();
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(getClass().getClassLoader().getResource(filePath).getFile()))) {
            br.readLine(); // Skip header line
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                if (values.length >= 3) {
                    String firstName = values[0];
                    String lastName = values[1];
                    String email = values[2];
                    String salary = values[3];
                    String currency = values[4];
                    String country = values[5];
                    people.add(new PersonCSV(firstName, lastName, email, salary, currency, country));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return people;
    }

    public static List<Person> sortByLastName(List<Person> persons) {
        return persons.stream()
                .map(person -> (PersonCSV) person)
                .sorted(Comparator.comparing(Person::getLastName))
                .collect(Collectors.toList());
    }

    public static List<PersonCSV> filterByCountry(List<Person> persons, String country) {
        return persons.stream()
                .map(person -> (PersonCSV) person)
                .filter(person -> person.getCountry().equalsIgnoreCase(country))
                .collect(Collectors.toList());
    }
}