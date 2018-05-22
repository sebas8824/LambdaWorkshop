package com.unit2;

public class ClosureExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // As a closure, the compiler expects to have b to be final without being declared as final
        doProcess(new Process() {
            @Override
            public void process(int i) {
                System.out.println(i +b);
            }
        }, a);

        // As a lambda happens the same thing
        doProcess((n) -> System.out.println(n + b), a);
    }

    public static void doProcess(Process p, int i) {
        p.process(i);
    }
}

interface Process {
    void process(int i);
}
