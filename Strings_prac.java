package OOP;

public class Strings_prac {
    public static void main(String[] args) {
    //    String s1="Hello";
    //    String s2="Hello";

    //comparison of string 
    String s1=new String("Hello");
    String s2=new String("Hello");
    // if(s1== s2){
    //     System.out.println("equal");
    // }
    // else{
    //     System.out.println("Not equal");
    // } 

    if(s1.equals(s2)){
        System.out.println("equal");
    }
    else{
        System.out.println("Not equal");
    }
    
    String s3="123";
    System.out.println(s1+s3);
    System.out.println("lowercase: "+s1.toLowerCase());
    System.out.println("uppercase: "+s1.toUpperCase());
    System.out.println("Character At 2: "+s1.charAt(2));
    System.out.println("index of o: "+s1.indexOf('o'));
    System.out.println("Replace o to w: "+s1.replace('o','w'));

    System.out.println("concate s1: "+s1.concat("World"));
    System.out.println("after concat s1 will be "+s1);

    System.out.println("Hash code: "+s2.hashCode());

    }
    
}
