package domain;

public class Animal {
    
    protected int age;
    
    protected double weight;
    
    protected String name;
    
    protected String animalClass;
    
    public Animal() {
        name = "generic animal";
        weight = 25;
    }
            
    public void sleep() {
        System.out.println("Animal is sleeping...");
    }
    
    public void eat() {
        System.out.println("Animal is eating...");
    }

    public void rest() {
        System.out.println("Animal is resting...");
    }

    @Override
    public String toString() {
        return "This animal:" + "\nName:\t" + name + "\nWeight:\t" + weight+" kg\t" + "\nAge:\t" + age + "\nAnimalClass:\t" + animalClass;
    }

 
}
