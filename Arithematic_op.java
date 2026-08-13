
import java.util.Scanner;

public class Arithematic_op {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        float num1=sc.nextFloat();
        System.out.println("Enter second number");
        float num2=sc.nextFloat();
        System.out.println("Addition: "+(num1+num2));
        System.out.println("Substraction: "+(num1-num2));
        System.out.println("Multiplication: "+(num1*num2));
        System.out.println("Division: "+(num1/num2));
        System.out.println("Modulus: "+(num1%num2));
        sc.close();
    }
}
