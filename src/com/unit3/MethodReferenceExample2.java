package com.unit3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import com.unit1.Person;


public class MethodReferenceExample2 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Sebastian", "Benitez", 29),
                new Person("Judith", "Gomez", 65),
                new Person("Alejandra", "Valencia", 29),
                new Person("Toby", "Cocker", 2)
        );

        // Using an instance method because of the second lambda expression
        printWithCondition(people, p -> System.out.println(p.toString()), p -> true);
        // or can be done like this that represents (p) -> methodName(p) === Class::methodName
        printWithCondition(people, System.out::println, p -> true);
    }

    public static void printWithCondition(List<Person> people, Consumer<Person> consumer, Predicate<Person> predicate) {
        for(Person p : people) {
            if(predicate.test(p))
                consumer.accept(p);
        }
    }

    interface Condition {
        boolean test(Person p);
    }
}
