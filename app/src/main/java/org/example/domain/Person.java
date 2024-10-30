package org.example.domain;


public class Person {

    private String name;
    private String lastName;
    private String email;
//    private String company;

    public Person() {
    }

    public Person(String name, String email,String lastName) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
//        this.company = company;
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

    public void setLastName(String lastName
    ) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email
    ) {
        this.email = email;
    }

//    public String getCompany() {
//        return company;
//    }
//
//    public void setCompany(String company) {
//        this.company = company;
//    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", email=" + email +
                '}';
    }
}
