package domain;


 /**
 * The class Predator extends animal
 */ 
public class Predator extends Animal {
    
    protected boolean isInGroop;
       

/** 
 *
 * Hunt
 *
 */
    public void hunt() { 

        System.out.println("Predator is hunting...");
    }
    

/** 
 *
 * Fly
 *
 */
    public void fly() { 

        System.out.println("Predator is flying...");
    }
}
