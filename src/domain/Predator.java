package domain;

public class Predator extends Animal {
    
    protected boolean isInGroop;
       
    public void hunt() {
        System.out.println("Predator is hunting...");
    }
    
    public void fly() {
        System.out.println("Predator is flying...");
    }
}
