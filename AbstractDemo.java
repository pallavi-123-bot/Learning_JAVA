package Abstract_And_Anonymous;

// class Animal{
//     abstract void eat();//error because the abstract method is always in the abstract 
//     public void breath(){
//         System.out.println("All animals can take the breath.");
//     }
// }

abstract class Animal{
    abstract void eat();//error because the abstract method is always in the abstract 
    public void breath(){
        System.out.println("All animals can take the breath.");
    }
}
class Cat extends Animal{

    void eat(){
        System.out.println("Cat eats catfood");
    }

}
public class AbstractDemo {
    public static void main(String[] args) {
        Animal cobj=new Cat();
        //Cat obj=new Cat(); it is also correct 
        cobj.eat();
        cobj.breath();



    }
    
}
