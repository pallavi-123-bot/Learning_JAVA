package OOP;
class Calculator{
    public void add(int num1,int num2){
        //Not using return
        System.out.println("addition: "+(num1+num2));
    }
    public int sub(int num1,int num2){
        //Using return
        int result=num1-num2;
        return result;

}
}
public class class_object {
    public static void main(String[] args) {
        int n1=15;
        int n2=75;
        Calculator c=new Calculator();//object creation
        c.add(n1,n2);//object instantiation
        int r=c.sub(n1, n2);
        System.out.println("Substraction: "+r);
    }
}
