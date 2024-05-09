package assignment2.commons;

import java.util.Objects;

/**
 * Please review this class and find out the purpose of each method
 * Do not change this class.
 */
public class Person {
    // The name of the person
    String name, surname, personalNumber;

    // Constructor of the class
    public Person(String name, String surname, String personalNumber) {
        this.name = name;
        this.surname = surname;
        this.personalNumber = personalNumber;
    }

    // Get the name of the person
    public String getName() {
        return name;
    }

    // Set the name of the person
    public void setName(String name) {
        this.name = name;
    }

    // Get the surname of the person
    public String getSurname() {
        return surname;
    }

    // Set the surname of the person
    public void setSurname(String surname) {
        this.surname = surname;
    }

    // Get the personal number of the person
    public String getPersonalNumber() {
        return personalNumber;
    }

    // Set the personal number of the person
    public void setPersonalNumber(String personalNumber) {
        this.personalNumber = personalNumber;
    }

    // Override the toString method to print the object
    // in a human-readable format
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", surname='").append(surname).append('\'');
        sb.append(", personalNumber='").append(personalNumber).append('\'');
        sb.append('}');
        return sb.toString();
    }

    // Override the equals method to compare two objects
    // If the personal number is the same, then the objects are equal
    // Otherwise, they are not equal
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(personalNumber, person.personalNumber);
    }

    // Override the hashCode method to generate a hash code
    // based on the personal number
    @Override
    public int hashCode() {
        return Objects.hash(personalNumber);
    }
}
