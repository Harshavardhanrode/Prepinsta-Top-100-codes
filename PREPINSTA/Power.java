/* 
import java.util.Scanner;
public class Power {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = x.nextInt();
        System.out.print("Enter the power:");
        int power = x.nextInt();
        System.out.println("power of number is:"+ Math.pow(num, power));
    }
    
}*/

import java.util.Scanner;
public class Power {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = x.nextInt();
        System.out.print("Enter the power:");
        int power = x.nextInt();
        
        int result=1;
        while(power !=0){
            result = result*num;
            power--;
        }
        x.close();
    }
    
}

