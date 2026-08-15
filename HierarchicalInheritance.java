package Inheritance;

class Animal{
    public void eat(){
        System.out.println("Animals Eat a food");
    }
}

class Dog extends Animal{
    public void sound(){
        System.out.println("Dog is Barking");
    }
}

class Horse extends Animal{
    public void run(){
        System.out.println("Horse run faster");
    }
} 
public class HierarchicalInheritance {
    public static void main(String[] args) {
        Horse horse=new Horse();
        horse.eat();
        horse.run();
        new Dog().sound();
        new Dog().eat();

    }
    
}
