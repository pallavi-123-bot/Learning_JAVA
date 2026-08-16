package Inheritance;

final class Area{
    public final void display(){
    System.out.println("in Parent class");
    }
}
class Rectangle extends Area{ //compile time error if Area class is final.
    public void display(){ //compile time error if display method is final.
    System.out.println("in child class");
    }

    public int rectangleArea(int L,int B){
        return L*B;
    }

}
public class finalkeyword {
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.display();
        System.out.println(r.rectangleArea(7, 3));
    
        //final variable
        final double PI=3.14;
        System.out.println("Pi value is : "+PI);

       // PI=34; // Compile time error
    }
}
