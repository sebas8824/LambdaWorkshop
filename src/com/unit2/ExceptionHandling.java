package com.unit2;

import jdk.nashorn.internal.runtime.ECMAException;

import java.util.function.BiConsumer;

public class ExceptionHandling {
    public static void main(String[] args) {
        int[] someNumbers = { 1, 2, 3, 4 };
        int key = 0;

        // Old fashioned exception handling
        process(someNumbers, key, (k, v) -> {
            try {
                System.out.println(k/v);
            } catch(Exception e) {
                System.out.println("You can't divide by zero, or can you?");
            }

        });

        // Better way to handle exceptions wrapping a lambda in a function
        process(someNumbers, key, wrapperLambda((k, v) -> System.out.println(v/k)));
    }

    private static void process(int[] numbers, int key, BiConsumer<Integer, Integer> consumer) {
        for (int i: numbers) {
            consumer.accept(i, key);
        }
    }

    private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
        return (k, v) -> {
            try {
                consumer.accept(k, v);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        };
    }
}
