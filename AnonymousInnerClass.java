package Abstract_And_Anonymous;

class Demo{
    public void show(){
        System.out.println("Inner class");
    }
}
public class AnonymousInnerClass {
    public static void main(String[] args) {
        Demo obj=new Demo(){
            //Anonymous Inner Class
           public void show(){
        System.out.println("Inner class");
    } 
        };
        obj.show();
    }
}
