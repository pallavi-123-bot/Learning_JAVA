package Inheritance;

class X{
    X(){
        System.out.println("In A class");
    }
     X(int a){
        System.out.println("In A class Parametrised");
    }
}
class Y extends X{
    Y(){
        System.out.println("In B class");
    }
     Y(int a){
        //this(); //for calling the same class constructor
        //super(a); // for caling parent parametrised constructor.
        System.out.println("In B class Parametrised");
    }
}
public class ThisAndSuper {
    public static void main(String[] args) {
        
    //Y y=new Y();
    Y y1=new Y(4);
    }
    
}
