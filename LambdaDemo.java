
@FunctionalInterface
interface A{
    void show(int i,int b);
}

public class LambdaDemo {
    public static void main(String[] args) {

        //Lambda with zero Paramters
       // A obj=() -> System.out.println("in show");

       //Lambda with one parameter
       //A obj=i-> System.out.println("Value is "+i);

        //Lambda with two parameter
       A obj=(i,j)-> System.out.println("Value is "+i+" "+j);

        //Normal
        // A obj=new A(){
        //     public void show(){
        //         System.out.println("in show");
        //     }
        // };
        obj.show(5,4);
    }

    
}
