package lib.test;

import lib.Greeter;

public class GreeterTester {

    public static void main(String[]args) {

        Greeter hello = new Greeter();
        Greeter hi    = new Greeter("Hi");

        hello.greet();
        hi.greet();
    }

}

