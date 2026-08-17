package Inheritance;

import java.util.Scanner;

interface add{
//    default void add(int a,int b){
//          System.out.println("Addition of "+a+" and "+b+" is "+(a+b));
//     }

void add(int a,int b);
}
interface sub{
    void sub(int a,int b);
}
class Cal implements add,sub{
    public void add(int a,int b){
        System.out.println("Addition of "+a+" and "+b+" is "+(a+b));
    }

    public void sub(int a,int b){
        System.out.println("substraction of "+a+" and "+b+" is "+(a-b));
    }
}
public class MultipleInheritanceusingInterface //implements add if make add as default
{
    public static void main(String[] args) {

        // MultipleInheritanceusingInterface o=new MultipleInheritanceusingInterface();
        // o.add(2,3);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int x=sc.nextInt();
        int y=sc.nextInt();
        Cal obj=new Cal();
        obj.add(x,y);
        obj.sub(x,y);
    }
    
}
