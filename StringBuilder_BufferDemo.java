package OOP;

public class StringBuilder_BufferDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);

        sb.insert(1, "Java");
        System.out.println(sb);

        sb.append("world");
        System.out.println(sb);

       System.out.println(sb.capacity());
       System.out.println(sb.toString());

System.out.println("****String Buffer****");
       StringBuffer sb1 = new StringBuffer("Learn Java");
        System.out.println(sb1);

        sb1.insert(1, "Hello");
        System.out.println(sb);

        sb1.append("world");
        System.out.println(sb1);

       System.out.println(sb1.capacity());
       System.out.println(sb1.toString());

    }
    
}
