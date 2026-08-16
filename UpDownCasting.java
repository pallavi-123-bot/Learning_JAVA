package Inheritance;

class Parent {
    public void show1(){
        System.out.println("Parent class");
    }
}

class child extends Parent{
    public void show2(){
        System.out.println("Child class");
    }
}
public class UpDownCasting {
public static void main(String[] args) {
    Parent obj=new child();//Upcasting 
    obj.show1();

    child cobj=(child) obj; //downcasting
    cobj.show1();
    cobj.show2();




}
    
}
