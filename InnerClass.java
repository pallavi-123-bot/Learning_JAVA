package Abstract_And_Anonymous;

class A{
    void show(){
        System.out.println("Outer class");
    }

    class B{
        void show1(){
            System.out.println("Inner Class.");
        }
    }
}
public class InnerClass {
    public static void main(String[] args) {
        A aobj=new A();
        aobj.show();
        //aobj.show1(); //error

        A.B bobj=new A().new B();
        bobj.show1();


        
    }
    
}
