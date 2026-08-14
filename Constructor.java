package OOP;

class Employee1{
    int ID;
    int salary;

    //Default constructor
    public Employee1() {
        ID=2;
        salary=35000;
    }

    //Parameterized Constructor
    public Employee1(int ID, int salary) {
        this.ID = ID;
        this.salary = salary;
    }

    //Copy COnstructor
       Employee1(Employee1 e) {
        this.ID=e.ID;
        this.salary=e.salary;
    }
    

    // public void setID(int id){
    //     ID=id;
    // }
    // public void setsalary(int sal) { 
    //     salary=sal;
    // }

    public void getID(){
        System.out.println("ID: "+ID);
    }

    public void getsalary(){
        System.out.println("Salary: "+salary);
    }
}

public class Constructor {
    public static void main(String[] args) {
        //Default constructor is get invoked
        Employee1 emp=new Employee1();
        emp.getID();
        emp.getsalary();

        //Parameterized constructor is get invoked
        Employee1 emp1=new Employee1(3,56000);
        emp1.getID();
        emp1.getsalary();

        Employee1 emp2 = new Employee1(emp1);
        emp2.getID();
        emp2.getsalary();
    }
        

    }
