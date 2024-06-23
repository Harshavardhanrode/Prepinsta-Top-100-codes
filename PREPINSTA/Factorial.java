//factorial of number;
//1)using function-------------------------------------------------------------------------------------------------------------------
/*import java.util.Scanner;
public class Factorial {
    public static int facto(int num) {
        if(num==0)
            return 1;
        
        return facto(num-1)*num;
    }
    public static void main(String[] args) {
        System.out.print("enter the number:");
        Scanner x = new Scanner(System.in);
        int num = x.nextInt();

        System.out.println("factorial is :"+ facto(num));
        x.close();

        
    }
    
}*/
//using for loop---------------------------------------------------------------------------------------------------------------------------------
import java.util.Scanner;
public class Factorial {
    
    public static void main(String[] args) {
        System.out.print("enter the number:");
        Scanner x = new Scanner(System.in);
        int num = x.nextInt();
        int fact = 1;

        for(int i=1;i<=(num);i++){
            fact = fact *i;

        }
        System.out.println("factorial is:"+ fact);
        x.close();

        
    }
    
}
