import java.util.*;
public class ReverseOfNo{
    
    public static void main(String[]args)
    {
      //using while loop
        /*  int num ,reverse = 0,remainder = 0;
        Scanner x = new Scanner(System.in);
        System.out.print("enter your number:");
        num = x.nextInt();

        while(num!=0){
            remainder = num %10;
            reverse = reverse*10 + remainder;
            num /=10;
        }
        System.out.println(reverse);
        x.close();*/



        /* 
        // using for loop---------------------------------------------------------------
        int n,reverse = 0,remainder = 0;
        Scanner x = new Scanner(System.in);
        System.out.print("enter your number:");
        n = x.nextInt();

        for(int num = n;num!=0; num = num/10){
            remainder = num %10;
            reverse = reverse*10 +remainder;
        }
        System.out.println(reverse);
        x.close();
    */


        ////using recurssion ---------------------------------------------------------------
   /*   
    
    }*/

    //using recussion
       /*import java.util.Scanner;

        public class ReverseOfNo1 {
        static int reverse(int num,int rev)
        {
            if(num==0)
                return rev;
            
            int remainder = num % 10;
            rev = rev *10 + remainder;
            return reverse(num/10 , rev);
        }
    
            public static void main(String[] args) {
                
                int num ,reverse =0;
                Scanner x = new Scanner(System.in);
                System.out.print("enter your number:");
                num = x.nextInt();

                System.out.println("reverse of number is :" + reverse(num,reverse));
                x.close();
            }*/


              /*import java.util.Scanner;------------------------------------------------------

        public class ReverseOfNo1 {
        static void reverse(int num,int rev)
        {
            if(num==0)
                return;
            
            int remainder = num % 10;
            System.out.print(remainder);
             reverse(num/10 , rev);
        }
    
            public static void main(String[] args) {
                
                int num ,reverse =0;
                Scanner x = new Scanner(System.in);
                System.out.print("enter your number:");
                num = x.nextInt();

               reverse(num, reverse);
                x.close();
            }
        }*/ 
         
    }

}