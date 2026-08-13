import java.util.Scanner;

public class logical_op {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first boolean value");
        Boolean first=sc.nextBoolean();
        System.out.println("Enter second boolean value");
        Boolean second=sc.nextBoolean();
        System.out.println(first+" && "+second+" = "+(first&&second));
        System.out.println(first+" || "+second+" = "+(first||second));
        System.out.println("!"+first+" = "+(!first));
        System.out.println("!"+second+" = "+(!second));
        sc.close();
     }
}
