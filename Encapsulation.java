package OOP;

class Employee{
    private int ID;
    private int salary;

    public void setID(int id){
        ID=id;
    }
    public void setsalary(int sal) { 
        salary=sal;
    }

    public void  getID(){
        System.out.println("ID: "+ID);
    }

    public void getsalary(){
        System.out.println("Salary: "+salary);
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Employee emp=new Employee();
        emp.setID(1);
        emp.setsalary(23400);
        emp.getID();
        emp.getsalary();
    }
    
}
