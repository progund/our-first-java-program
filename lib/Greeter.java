
package lib;

public class Greeter {

    private String greeting;

    public Greeter() {
        this.greeting = "Hello!";
    }
    
    public Greeter(String greeting) {
        this.greeting = greeting;
    }
    
    public void greet() {
        System.out.println(greeting);
    }

}
