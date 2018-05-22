package com.unit2;

public class ThisReferenceExample {
    public void doProcess(int a, Process p) {
        p.process(a);
    }

    public void execute() {
        doProcess(10, p -> {
            System.out.println("Value of i is: " + p);
            // this: Points to the instance of the object of where the execute method is being called
            System.out.println(this);
        });
    }
    // this: inside an anonymous method it takes it as the value of the instance inside the function,
    // in this case is the instance of Process.

    // As a lambda, it is unmodified, in this case refers to the static context

    public static void main(String[] args) {
        ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
        thisReferenceExample.doProcess(10, new Process() {
            @Override
            public void process(int i) {
                System.out.println("Value of i is: " + i);
                System.out.println(this);
            }

            @Override
            public String toString() {
                return "This is the anonymous inner class";
            }
        });

        // Lambda time
        thisReferenceExample.doProcess(10, p -> {
            System.out.println("Value of i is: " + p);
            //System.out.println(this);
        });

        thisReferenceExample.execute();
    }

    @Override
    public String toString() {
        return "This is the main reference of the class instance";
    }
}
