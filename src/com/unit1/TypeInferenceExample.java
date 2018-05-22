package com.unit1;

public class TypeInferenceExample {

    public static void main(String[] args) {
        // You can remove the String in the argument section because of
        // Type inference
        // If there is only one argument, the parenthesis can be excluded
        StringLengthLambda sll = s -> s.length();
        System.out.println(sll.getLength("Hello Lambda"));

        // Invoking a method
        printLambda(sll);
    }

    public static void printLambda(StringLengthLambda l) {
        System.out.println(l.getLength("Hello"));
    }

    interface StringLengthLambda {
        int getLength(String s);
    }
}
