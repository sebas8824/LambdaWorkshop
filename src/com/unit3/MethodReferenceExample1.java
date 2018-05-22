package com.unit3;

public class MethodReferenceExample1 {
    public static void main(String[] args) {

        // Excecuting with method using a lambda expression
        Thread t = new Thread( () -> printMessage());
        t.start();

        // Excecuting with method reference expression using an static method
        Thread s = new Thread(MethodReferenceExample1::printMessage);
    }

    public static void printMessage() {
        System.out.println("Hello");
    }
}
