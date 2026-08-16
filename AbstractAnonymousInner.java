package Abstract_And_Anonymous;

abstract class Human{
    abstract void speak();
    abstract void walk();
}
public class AbstractAnonymousInner {
public static void main(String[] args) {
    Human obj=new Human() {
        void speak(){
            System.out.println("Humans can speak.");
        }
        void walk(){
            System.out.println("Humans can walk.");
        }

    };
    obj.speak();
    obj.walk();
}
    
}
