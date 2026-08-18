
enum Laptop{
    Dell(70000),Asus(75000),Lenovo(50000),HP(60000),;

    Laptop(int i) {
        int price =i;
    }
    }


public class enumDemo{
    public static void main(String[] args) {
       //for access the dell
       // Laptop l=Laptop.Dell;
       
        for(Laptop lap:Laptop.values()){
            System.out.println(lap);
       }
       



       //enum in the switch case
    //    switch (l) {
    //        case Dell:
    //             System.out.println("In a Dell ");
    //            break;
    //            case Asus:
    //             System.out.println("In a Asus ");
    //            break;
    //            case Lenovo:
    //             System.out.println("In a Lenovo");
    //            break;
    //            case HP:
    //             System.out.println("In a HP");
    //            break;
    //        default:
    //            System.out.println("Not a case");
    // }


    //enum in if else loop
    // if(l==Laptop.Dell){
    //      System.out.println("In a Dell ");
    // }else if(l==Laptop.Asus){
    //      System.out.println("In a Asus ");

    // }else if(l==Laptop.Lenovo){
    //     System.out.println("In a Lenovo");
    // }
    // else if(l==Laptop.HP){
    //     System.out.println("In a HP");
    // }
    // else{
    //     System.out.println("Not a case");
    // }
}
}
