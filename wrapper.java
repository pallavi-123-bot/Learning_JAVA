package WrapperClass;

public class wrapper {
    public static void main(String[] args) {
        int a=7;
        // Integer i=new Integer(90);//Integer is an wrapper class
        // System.out.println(i);

        Integer num=a;//Autoboxing : int->Integer object
        System.out.println("The primitive int value is: "+a);
        System.out.println("The Integer value is: "+num);

        String str="234";
        int number=Integer.parseInt(str)*2;//unboxing 
        System.out.println("The String value is: "+str);
        System.out.println("The primitive int value of str*2 is: "+number);

    }
    
}
