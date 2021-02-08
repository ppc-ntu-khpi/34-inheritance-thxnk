package test;

import domain.Bird;
 /**
 * The class to test an animal
 */ 
public class TestAnimal {


/** 
 *
 * Main
 *
 * @param args  the args
 */
    public static void main(String[] args) { 

        Bird bird = new Bird("Jack");
        System.out.println(bird);
        bird.eat();
        bird.fly();
        bird.hunt();
        bird.rest();
        bird.sing();
        bird.sleep();
    }
}
