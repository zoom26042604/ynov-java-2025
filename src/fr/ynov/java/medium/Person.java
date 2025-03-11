package fr.ynov.java.medium;

import java.time.LocalDate;
import java.time.Period;

enum Nationality {
    ENGLISH,
    FRENCH,
    GERMAN,
}

public class Person {
    private String name;
    private LocalDate birthDate;
    private String gender;
    private float height;
    private float weight;
    private Nationality nationality;

    public Person(String name, LocalDate birthDate, String gender, float height, float weight, Nationality nationality) {
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.nationality = nationality;
    }

    public void printAttributes() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + calculateAge() + " years old");
        System.out.println("Date of Birth: " + birthDate);
        System.out.println("Gender: " + gender);
        System.out.println("Height: " + height + " cm");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Nationality: " + nationality);

    }

    public int calculateAge() {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    public static void main(String[] args) {
        Person person = new Person("John", LocalDate.of(1990, 1, 1), "male", 150.0f, 70.0f, Nationality.ENGLISH);
        person.printAttributes();
    }
}