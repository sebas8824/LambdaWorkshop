package com.unit1;

public class RunnableExample {

    public static void main(String[] args) {
        // Conventional example
        Thread mt = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable");
            }
        });
        mt.start();
        mt.run();

        // Lambda example
        Thread mlt = new Thread(() -> System.out.println("Inside Runnable in lambda!"));
        mlt.run();
    }
}
