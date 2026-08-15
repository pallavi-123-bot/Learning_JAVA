package Inheritance;

class Calculator{
    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
}

class AdvancedCalculator extends Calculator{
    public int Mul(int a,int b){
        return a*b;
    }
    public int div(int a,int b){
        return a/b;
    }
    public void show(String s,int a,int b,int r){
        System.out.println("Result of "+a+" "+s+" "+b+" is "+r);
    }
}
class VeryAdvancedCalculator extends AdvancedCalculator{
    public int square(int a){
        return a*a;
    }
    public int power(int a,int b){
        return (int)Math.pow(a, b);

    }
}
public class Multilevelnheritance {
    public static void main(String[] args) {
        VeryAdvancedCalculator obj=new VeryAdvancedCalculator();
         int a=obj.add(2, 5);
        obj.show("+",2,5,a);
        int b=obj.sub(6, 3);
         obj.show("-",6,3,b);
        int c=obj.Mul(9,2);
         obj.show("*",9,2,c);
        int d=obj.div(15,5);
         obj.show("/",15,5,d);
        int e=obj.square(3);
        obj.show("^", 3, 2, e);
        int f=obj.power(8, 4);
        obj.show("^", 8, 4, f);
    }
    
}
