//package org.example.model;
//
//import org.example.domain.Person;
//import org.example.domain.PersonCSV;
//import org.example.service.PeopleService;
//
//import java.util.Comparator;
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class PeopleModel {
//    private final PeopleService peopleList;
//
//    public PeopleModel() {};
//
////    public static List<Person> sortByLastName() {
////        return this.people.stream()
////                .sorted(Comparator.comparing(Person::getLastName))
////                .collect(Collectors.toList());
////    }
//
//    public static List<PersonCSV> filterByCountry(List<Person> persons, String country) {
//        return persons.stream()
////                .filter(person -> person instanceof PersonCSV)
//                .map(person -> (PersonCSV) person)
//                .filter(person -> person.getCountry().equalsIgnoreCase(country))
//                .collect(Collectors.toList());
//    }
//}
