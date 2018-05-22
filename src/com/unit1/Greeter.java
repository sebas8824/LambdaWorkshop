package com.unit1;

public class Greeter {

    public void greet(Greeting greeting) {
        greeting.perform();
    }

    public static void main(String args[]) {

        // Class instance
        Greeter greeter = new Greeter();
        // Below: implements the greeting interface using com.unit1.HelloWorldGreeting
        Greeting helloWorldGreeting = new HelloWorldGreeting();
        // Below: Of type of the interface that should conform.
        // it implements the interface inside the lambda.
        Greeting lambdaGreeting = () -> System.out.println("Hi World");
        // Below: Inner inline implementation, anonymous function
        Greeting innerClassGreeting = new Greeting() {
            public void perform() {
                System.out.println("Whats up buddy");
            }
        };

        greeter.greet(helloWorldGreeting);
        helloWorldGreeting.perform();
        lambdaGreeting.perform();
        innerClassGreeting.perform();

    }
}


// Create an interface with the method to be implemented in the lambda
// AND SHOULD HAVE ONLY ONE METHOD
interface MyLambda {
    void foo();
}