import java.util.Scanner;

public class while_loop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // System.out.println("Enter number to print table: ");
        // int number=sc.nextInt();
        // int i=1;
        // while(i<=10){
        //     System.out.println(number+" * "+i+" = "+(number*i));
        //     i++;   
        // }

        // * 
        // * * 
        // * * * 
        // * * * * 
        // * * * * *
        int i=0,n=4;
        while(i<=n){
            int j=0;
            while(j<i+1){
                System.out.print( " *");
                j++;
            }
            i++;
            System.out.println();
            
        }
    }
    
}
