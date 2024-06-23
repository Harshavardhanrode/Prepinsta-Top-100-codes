/*import java.util.*;
public class Sum_Of_No{
    public static void main(String[]args){
            Scanner x = new Scanner(System.in);
            System.out.println("enter the number:");
            int num = x.nextInt();
            int sum = 0;

            while(num!=0){
                sum = sum + (num%10);
                num = num/10;
            }
            System.out.println("sum of numbers is:" + sum);
            x.close();
    }
}*/



// method 2
// recurssion 
import java.util.*;
public class Sum_Of_No{
    public static void main(String[]args){
        Scanner x = new Scanner(System.in);
        int num = x.nextInt();
        int sum = 0;
        System.out.println("sum of numbers in givaen number is:"+ sumofno( num, sum)); 
         x.close();  
    }
    public static  int sumofno(int num,int sum){
        if(num ==0)
            return sum;
            
        sum = sum + (num%10);
         return sumofno(num/10, sum);
         
        
    }
    
}