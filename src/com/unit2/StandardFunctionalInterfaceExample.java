package com.unit2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.unit1.Person;

public class StandardFunctionalInterfaceExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Sebastian", "Benitez", 29),
                new Person("Judith", "Gomez", 65),
                new Person("Alejandra", "Valencia", 29),
                new Person("Toby", "Cocker", 2)
        );
        // Sort list by last name
        Collections.sort(people, (p1, p2) -> Comparator.comparing(Person::getLastName).compare(p1, p2));

        // Print lastname beggining with C without using interface directly
        performConditionally(people, p -> p.getFirstName().startsWith("T"), System.out::println);


    }

    public static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        for(Person p : people) {
            if(predicate.test(p))
                consumer.accept(p);
        }
    }
}
