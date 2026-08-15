package Inheritance;

class A{
    A(){
        System.out.println("Learning Java");
    }
}

class B{
    B(){
        System.out.println("Lerning Python");
    }
}

class C extends A,B{ //error occured because multiple inheritance is not supported by java.
    C(){
        System.out.println("Learning Both");
    }
}
public class MultilpleInheritance {
    public static void main(String[] args) {
        
    }
    
}
