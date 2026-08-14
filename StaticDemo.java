package OOP;

class Mobile{
    String brand;
    int price;
    static String name; //Static variable

    public void show(){
         System.out.println(brand+" : "+price+" : "+name);
    }

    //Static block
    static{
        System.out.println("Static block");
    }
    //Static method
    public static void display(Mobile obj){
        System.out.println(obj.brand+" : "+obj.price+" : "+name);
    }

}

public class StaticDemo {
    public static void main(String[] args) throws ClassNotFoundException{

        //use for class loading for static block testing
        //Class.forName("OOP.Mobile");
        Mobile obj=new Mobile();
        obj.brand="Oppo";
        obj.price=45673;
        obj.name="Smartphone";

        Mobile obj1=new Mobile();
        obj1.brand="Mi";
        obj1.price=68790;
        obj1.name="phone";

        obj.show();
        obj1.show();
        Mobile.display(obj1);// Static method calling

        
    }
    
}
