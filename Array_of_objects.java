package OOP;

class Student{
    int rollno;
    String name;
    float marks;
}

public class Array_of_objects {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.rollno=1;
        s1.name="vidya";
        s1.marks=89;

        Student s2=new Student();
        s2.rollno=2;
        s2.name="Janavi";
        s2.marks=91;

        //Array of an objects
        Student student[]=new Student[2];
        student[0]=s1;
        student[1]=s2;

        //Enhanced for loop
        for(Student stud:student){
            System.out.println(stud.rollno+" "+stud.name+" "+stud.marks);
        }

        //normal for loop
        for (int i =0; i < student.length; i++) {
            System.out.println(student[i].rollno+" "+student[i].name+" "+student[i].marks);
        }
        
    }
}
