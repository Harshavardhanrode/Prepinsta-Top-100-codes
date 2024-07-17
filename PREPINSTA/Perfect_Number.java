/* perfect number =>   factors(6) = {1,2,3,6}  =>  6={1+2+3}  */

import java.util.Scanner;
public class Perfect_Number{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.print("enter your number:" );
        int number=in.nextInt();

        NumberisPerfect(number);  
        in.close();      
    }

    public  static void NumberisPerfect(int number){
        int sum=0;
        for(int i=1;i<=number/2;i++){
            if(number%i==0)
                sum=sum+i;
        }
        System.out.println(sum);
        if(sum==number)
            System.out.println("number is perfect number");
        else
            System.out.println("not an perfect number");    
        
        
       
    }
}

/*methid2 = recurrsion *//* 
import java.util.Scanner;
public class Perfect_Number{
    static int sum=0;
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.print("enter your number:" );
        int number=in.nextInt();

        if(NumberisPerfect(number, 1)==number)
            System.out.println("number is perfect number");
        else
            System.out.println("number is not an perfect number");     
        in.close();   
    }

    public  static int NumberisPerfect(int number,int i){
      
        if(i<=number/2){
            if(number%i==0){
                 sum=sum+i;
            }
            NumberisPerfect(number, i+1);
        }
        return sum;
           
       
    }
}*/


/*method 3  time complexity - 0(sqrt(n)) *//* 
import java.util.Scanner;
public class Perfect_Number{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.print("enter your number:" );
        int number=in.nextInt();

        NumberisPerfect(number);  
        in.close();      
    }

    public  static void NumberisPerfect(int number){
        int sum=0;
        for(int i=1;i<=Math.sqrt(number);i++){
            if(number%i==0){
                if(i==1)
                    sum =sum+i;
                else if(i==number/i)
                    sum=sum+i;
                else    
                    sum=sum+i+number/i;    
            }
       }
        
        if(sum==number)
            System.out.println("number is perfect number");
        else
            System.out.println("not an perfect number");    
        
        
       
    }
}*/