
import java.util.Scanner;

public class Nested_if {
    public static void main(String[] args) {
        System.out.println("Number Comparison");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1=sc.nextInt();
        System.out.println("Enter Second number:");
        int num2=sc.nextInt();
        System.out.println("Enter third number:");
        int num3=sc.nextInt();
        if(num1>num2){
            if(num1>num3){
                System.out.println(num1+" is a largest number.");
            }
        }
        else if(num2>num1){
            if(num2>num3){
                System.out.println(num2+" is a largest number.");
            }
        }
        if(num3>num1){
            if(num3>num2){
                System.out.println(num3+" is a largest number.");
            }
        }
        sc.close();
    }
    
}
