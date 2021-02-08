package domain;


 /**
 * The class Animal
 */ 
public class Animal {
    
    protected int age;
    
    protected double weight;
    
    protected String name;
    
    protected String animalClass;
    

/** 
 *
 * It is a constructor. 
 *
 */
    public Animal() { 

        name = "generic animal";
        weight = 25;
    }
            

/** 
 *
 * Sleep
 *
 */
    public void sleep() { 

        System.out.println("Animal is sleeping...");
    }
    

/** 
 *
 * Eat
 *
 */
    public void eat() { 

        System.out.println("Animal is eating...");
    }


/** 
 *
 * Rest
 *
 */
    public void rest() { 

        System.out.println("Animal is resting...");
    }

    @Override

/** 
 *
 * To string
 *
 * @return String
 */
    public String toString() { 

        return "This animal:" + "\nName:\t" + name + "\nWeight:\t" + weight+" kg\t" + "\nAge:\t" + age + "\nAnimalClass:\t" + animalClass;
    }

 
}
