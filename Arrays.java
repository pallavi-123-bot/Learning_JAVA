package OOP;

public class Arrays {
    public static void main(String[] args) {
        //simple defination of array
        // int num[]={3,4,5,6}; 
        
        int arr[]=new int[5];
        arr[0]=56;
        arr[1]=78;
        arr[2]=67;
        arr[3]=52;
        arr[4]=12;

        // arr[5]=23; //error arrays out of bound
        for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
        }
        
    }
    
}
