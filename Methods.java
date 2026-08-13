package OOP;

class Vehicle{
    public void drive(){
        System.out.println("Driving vehicle.");
    }

    public int noofwheels(){
        return 4;
    }

    public void nameofvehicle(String name){
        System.out.println("Your vehicle is of "+name+" brand");
    }

}
public class Methods {
 public static void main(String[] args) {
    Vehicle obj=new Vehicle();
    obj.drive();
    int a=obj.noofwheels();
    System.out.println(a);
    String n="HONDA";
    obj.nameofvehicle(n);
 }   
}
