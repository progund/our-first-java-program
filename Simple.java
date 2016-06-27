import lib.Greeter;

public class Simple {

    public static void main(String[]args) {

        Greeter hello = new Greeter();
        Greeter hi    = new Greeter("Hi, I am simple");

        hello.greet();
        hi.greet();
    }


}
