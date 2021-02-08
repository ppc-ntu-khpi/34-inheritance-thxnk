package domain;


 /**
 * The class Bird extends predator
 */ 
public class Bird extends Predator {

    private boolean haveAnOwner;


/** 
 *
 * a constructor
 *
 * @param age  the age
 * @param weight  the weight
 * @param name  the name
 * @param animalClass  the animal class
 * @param haveAnOwner  the have an owner
 */
    public Bird(int age, double weight, String name, String animalClass, boolean haveAnOwner) { 

        this.age = age;
        this.weight = weight;
        this.name = name;
        this.animalClass = animalClass;
        this.haveAnOwner = haveAnOwner;
    }


/** 
 *
 * a common construtor with only name
 *
 * @param name  the name
 */
    public Bird(String name) { 

        this(3,2.3,name,"home bird",true);
    }
    

/** 
 *
 * Sing
 *
 */
    public void sing() { 

        System.out.println("Bird is singing...");
    }
     
    @Override

/** 
 *
 * Hunt
 *
 */
    public void hunt() { 

        System.out.println("Bird is hunting for a smth it can eat...");
    }
    
    @Override

/** 
 *
 * Fly
 *
 */
    public void fly() { 

        System.out.println("Bird is flying...");
    }

    @Override

/** 
 *
 * To string
 *
 * @return String
 */
    public String toString() { 

        return super.toString()+"\nhaveAnOwner:\t"+this.haveAnOwner;
    }

    @Override

/** 
 *
 * Sleep
 *
 */
    public void sleep() { 

        System.out.println("Bird is sleeping...");
    }

    @Override

/** 
 *
 * Eat
 *
 */
    public void eat() { 

        System.out.println("Bird is eating...");
    }
    
    @Override

/** 
 *
 * Rest
 *
 */
    public void rest() { 

        System.out.println("Bird is resting...");
    }
    
    
}
