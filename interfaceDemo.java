
interface  Area{
    public void area(float r); //in interface the abstract methods are declared.
    double PI=3.14; //by deault in interface the variables are the final ,public.
}

class Circle implements Area{
    public void area(float r){
        System.out.println("Area of circle: "+(PI*r*r));
    }
}

public class interfaceDemo {
    public static void main(String[] args) {
        Area aobj;//allowed
        //aobj=new Area();//not allowed
        aobj=new Circle();
        aobj.area(3);


    }
    
}
