import java.util.*;
public class if_else_Ladder {
    public static void main(String[] args) {
        System.out.println("Grade Calculator");
        System.out.println("Enter marks: ");
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        if(marks>=75 && marks<=100){
            System.out.println("Excellent! You got grade O");
        }else if(marks<75 && marks>=60){
            System.out.println("very Good! You got grade A");
        }else if(marks<60 && marks>=45){
            System.out.println("Good! You got grade B");
        }else if(marks<45 && marks>=35){
            System.out.println("You got grade c");
        }else if(marks<35 && marks>=28){
            System.out.println("You are pass");
        }else if(marks<28 && marks>=0){
            System.out.println(" You are fail");
        }else{
            System.out.println("Invalid Marks!");
        }
        sc.close();
    }
    
}
