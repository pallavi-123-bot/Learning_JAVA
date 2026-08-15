package OOP;

class Test{
    Test(){
        System.out.println("Object Created!");
    }
    void show(){
        System.out.println("Method called using the anonymous object");
    }
}
public class Anonymous {
 public static void main(String[] args) {
    new Test().show();
 }
}
