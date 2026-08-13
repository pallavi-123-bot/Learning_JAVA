package OOP;

class AreaCalculator{
    public int Area1(int n1,int n2){
        return (n1*n2); 
    }
     public float Area1(float n1){
        return (float) (3.14*n1*n1); 
    }

}
public class Method_overloading {
    public static void main(String[] args) {
        int num1=45;
        int num2=30;
        AreaCalculator obj=new AreaCalculator();
        System.out.println("Area of Rectangle: "+obj.Area1(num1, num2));
        System.out.println("Area of circle: "+obj.Area1(num1));

    }
}
