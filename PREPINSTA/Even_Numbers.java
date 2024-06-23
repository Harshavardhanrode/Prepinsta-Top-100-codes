import java.util.Scanner;

public class Even_Numbers {
    public static void main(String []args)
    {
        System.out.print("enter the number:");
        Scanner x = new Scanner(System.in);
        int num =x.nextInt();
        
        
         //with ifelse
        if(num %2 == 0)
            System.out.println("number is even");
        else
            System.out.println("number is odd");
            
           
        
        
       /* //with ternery operators
        String str = (num%2==0)? "number is even" : "number is odd";
        System.out.println(str);
        */

        x.close();
    }
    
    
}
