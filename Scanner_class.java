import java.util.Scanner;
public class Scanner_class {
    public static void main(String[] args) {
        System.out.println("Enter Student details: ");
        System.out.println("Enter roll number: ");
        Scanner sc =new Scanner(System.in);
        int number=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Name: ");
        String name=sc.nextLine();
        System.out.println("Enter Marks: ");
        float marks=sc.nextFloat();

        System.out.println("Student Details:");
        System.out.println("Student roll number: "+number);
        System.out.println("Student Name: "+name);
        System.out.println("Student Marks: "+marks);
        sc.close();
    }

    
}
