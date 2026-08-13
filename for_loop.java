public class for_loop {
    public static void main(String[] args) {
        // for(int i=0;i<5;i++){
        //     for(int j=0;j<5;j++){
        //         System.out.println("i = "+i+" ,j = "+j);
        //     }
        // }

        // pattern using for loop
        // 
        
        for(int i=5;i>0;i--){
            for(int j=i-1;j>0;j--){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    
}
