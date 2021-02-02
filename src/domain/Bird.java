package domain;

public class Bird extends Predator {

    private boolean haveAnOwner;

    public Bird(int age, double weight, String name, String animalClass, boolean haveAnOwner) {
        this.age = age;
        this.weight = weight;
        this.name = name;
        this.animalClass = animalClass;
        this.haveAnOwner = haveAnOwner;
    }

    public Bird(String name) {
        this(3,2.3,name,"home bird",true);
    }
        

    public void play() {
        System.out.println("Bird is playing...");
    }
    
    public void sing() {
        System.out.println("Bird is singing...");
    }
     
    @Override
    public void hunt() {
        System.out.println("Bird is hunting for a smth it can eat...");
    }
    
    @Override
    public void fly() {
        System.out.println("Bird is flying...");
    }

    @Override
    public String toString() {
        return super.toString()+"\nhaveAnOwner:\t"+this.haveAnOwner;
    }

    @Override
    public void sleep() {
        System.out.println("Bird is sleeping...");
    }

    @Override
    public void eat() {
        System.out.println("Bird is eating...");
    }
    
    @Override
    public void rest() {
        System.out.println("Bird is resting...");
    }
    
    
}
