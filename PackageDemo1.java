package Employee;

import java.util.*; //import the package for Scanner
public class PackageDemo1 {
    public static void main(String[] args) {
        PackageDemo2 obj=new PackageDemo2();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        int i=sc.nextInt();
        obj.setEmp_id(i);
        System.out.print("Enter Employee Salary: ");
        int s=sc.nextInt();
        obj.setEmp_salary(s);
         System.out.print("Enter Employee Name: ");
         String n=sc.next();
        obj.setName(n);
        System.out.print("Enter Employee Department: ");
        String d=sc.next();
        obj.setDepartment(d);

        System.out.println("********Employee Details*********");
        System.out.println("Employee ID : "+obj.getEmp_id());
        System.out.println("Employee Name : "+obj.getName());
        System.out.println("Employee Department : "+obj.getDepartment());
        System.out.println("Employee Salary : "+obj.getEmp_salary());
    }
    
}
