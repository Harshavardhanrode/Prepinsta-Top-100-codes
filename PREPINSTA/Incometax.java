/*
Calculate income tax paid by an employee to the government as per the slabs mentioned below:
 * 
 * 
 *   Income Slab                             	Tax
     2.5L – 5.0L  	                            5%
     5.0L – 10.0L 	                            20% 
     Above 10.0L	                            30%


     Note that there is not tax below 2.5L. Take the input amount as input from the user.

 */

import java.util.Scanner;


public class Incometax{
    
    public static void main(String[] args){
        int num1 = 36, num2 = 60, hcf=0;

            for (int i = 1; i <= num1 || i <= num2; i++)
            {
                if (num1 % i == 0 || num2 % i == 0)
                     hcf = i;
            }
            System.out.println("The HCF: "+ hcf);
            System.out.println(i);
    }
    
}
