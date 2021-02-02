package test;

import domain.Bird;

public class TestAnimal {

    public static void main(String[] args) {
        Bird bird = new Bird("Jack");
        System.out.println(bird);
        bird.eat();
        bird.fly();
        bird.hunt();
        bird.play();
        bird.rest();
        bird.sing();
        bird.sleep();
    }
}
