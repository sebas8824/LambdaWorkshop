package com.unit1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LamdaExcercise {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Sebastian", "Benitez", 29),
                new Person("Judith", "Gomez", 65),
                new Person("Alejandra", "Valencia", 29),
                new Person("Toby", "Cocker", 2)
        );

        // Sort list by last name
        Collections.sort(people, (p1, p2) -> Comparator.comparing(Person::getLastName).compare(p1, p2));

        // Print elements in the list
        PrintLambda print = p -> people.forEach(person -> {
            System.out.println(person.toString());
        });
        print.print(people);

        // Print lastname beggining with B using interface
        PrintLambda lastNameB = p -> people.forEach(person ->{
            if (person.getLastName().startsWith("B")) System.out.println(person.toString());
        });

        lastNameB.print(people);

        // Print lastname beggining with C without using interface directly
        printWithCondition(people, p -> p.getFirstName().startsWith("T"));
    }

    public static void printWithCondition(List<Person> people, Condition condition) {
        for(Person p : people) {
            if(condition.test(p))
                System.out.println(p);
        }
    }

    interface PrintLambda {
        void print(List<Person> list);
    }

    interface Condition {
        boolean test(Person p);
    }
}
