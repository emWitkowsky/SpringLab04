/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

import org.example.domain.*;
import org.example.service.PeopleService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("people.xml");

        PersonXML prezes = (PersonXML) context.getBean("prezes");
        PersonXML wiceprezes = (PersonXML) context.getBean("wiceprezes");
        PersonXML sekretarka = (PersonXML) context.getBean("sekretarka");

        System.out.println(prezes);
        System.out.println(wiceprezes);
        System.out.println(sekretarka);

        PeopleService peopleService = new PeopleService();
        List<Person> people = peopleService.loadPeopleFromCSV("mock_data.csv");
//        List<PersonCSV> people2 = peopleService.loadPeopleFromCSV("mock_data.csv");
//        for (Person person : people) {
//            System.out.println(person);
//        }

//        List<Person> sortedPeople = Sort.sortByLastName(people);
//        System.out.println(sortedPeople);

        List<Person> sortedPeople = peopleService.sortByLastName(people);
        System.out.println(sortedPeople);

        List<PersonCSV> filteredPeople = peopleService.filterByCountry(people, "Comoros");
        System.out.println(filteredPeople);
    }
}
