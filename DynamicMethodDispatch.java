package Inheritance;

class ElectronicsEqp {
    public void show(){
        System.out.println("In Parent class");
    }
}
class TV extends ElectronicsEqp{
    public void show(){
        System.out.println("In TV subclass");
    }
}
class Phone{
    public void show(){
        System.out.println("In phone class");
    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        ElectronicsEqp e=new TV(); //dynamic method dispatch
        e.show();

      //  e.new Phone().show(); //error because Phone is not the subclass of any class

    }
    
}
