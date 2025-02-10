package org.example;

import java.util.Objects;

public class Person {
    private String name;
    private String surname;
    private String middleName;
    private int birthDate;

    public Person(String n, String s, String m, int a){
        this.name = n;
        this.surname = s;
        this.middleName = m;
        this.birthDate = a;
    }
    public Person(Person p){
        this.name = p.getName();
        this.surname = p.getSurname();
        this.middleName = p.getMiddleName();
        this.birthDate = p.getBirthDate();
    }
    public String getName() {return name;}
    public String getSurname() {return surname;}
    public String getMiddleName() {return middleName;}
    public int getBirthDate() {return birthDate;}
    public void setName(String name) {this.name = name;}
    public void setMiddleName(String middleName) {this.middleName = middleName;}
    public void setSurname(String surname) {this.surname = surname;}
    public void setBirthDate(int birthDate) {this.birthDate = birthDate;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return birthDate == person.birthDate && Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && Objects.equals(middleName, person.middleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, middleName, birthDate);
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", middleName='" + middleName + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
