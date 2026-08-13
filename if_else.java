import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        //even and odd
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int number=sc.nextInt();
        if(number%2==0){
            System.out.println(number+" is even number.");
        }
        else{
            System.out.println(number +" is odd number");
        }
    sc.close();
    }
    
}
