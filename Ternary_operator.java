
import java.util.Scanner;

public class Ternary_operator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to check positive or negative: ");
        int number=sc.nextInt();
        String result=(number>=0)?"Positive":"Negative";
        System.out.println(number+" is "+result);
        sc.close();
    }
}
