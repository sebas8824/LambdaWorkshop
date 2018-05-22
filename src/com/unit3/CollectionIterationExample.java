package com.unit3;

import java.util.Arrays;
import java.util.List;
import com.unit1.Person;


public class CollectionIterationExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Sebastian", "Benitez", 29),
                new Person("Judith", "Gomez", 65),
                new Person("Alejandra", "Valencia", 29),
                new Person("Toby", "Cocker", 2)
        );

        // EXTERNAL ITERATORS
        // Using for
        for(int i =0; i > people.size(); i++) {
            System.out.println(people.get(i));
        }

        // Using enhanced for
        for (Person person : people) {
            System.out.println(person);
        }

        // INTERNAL ITERATORS
        // Using a consumer: Which is a function, that is represented by a lambda expression
        people.forEach(p -> System.out.println(p));
        // And can be improved using Method References
        people.forEach(System.out::println);
    }
}
