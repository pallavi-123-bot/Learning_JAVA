package Inheritance;

class Human{
    public void eat(){
        System.out.println("Humans eat food.");
    }
}

class Male extends Human{
    public void eat(){
        super.eat(); //to invoke the super class overiden method.
        System.out.println("Males eat food.");
    }
}
public class Method_Overriding {
    public static void main(String[] args) {
        Male d=new Male();
        d.eat();
    }
    
}
