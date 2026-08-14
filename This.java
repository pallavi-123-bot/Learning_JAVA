package OOP;
class Demo{
    int a;
    int b;

    //To differentiate between the instance and local variables.
    public void setA(int a) {
       this. a = a;
       
    }
    public void getA(){
         System.out.println(a);
    }

    void display(){
        System.out.println("Calling method using this");
    }
    Demo get(){
        this.display();
        return this;
    }
    Demo(){
        this(3);
    }
    Demo(int a){
        System.out.println("Invoking the constructor by using this");
    }
}
public class This {
    public static void main(String[] args) {
        Demo obj=new Demo();
        obj.setA(5);
        obj.getA();
        System.out.println(obj.get());
    }
    
}
