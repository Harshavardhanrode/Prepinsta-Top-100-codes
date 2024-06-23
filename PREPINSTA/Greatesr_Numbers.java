public class Greatesr_Numbers {
    public static void main(String []args)
    {
        
        int num1 =8,num2= 10;
        /* 
        if(num1==num2)
            System.out.println("both numbers are equal");
        else
            if(num1>num2)
                System.out.println("num1 is greater");
            else
                System.out.println("num2 is greater");    
            */
    


            
            if(num1==num2)
                System.out.println("both are equal");
            else
            {
                String str = num1>num2 ? "num1 is greater" :"num2 is greater";
                System.out.println(str); 
            }
            
              
            
                // using math function
            //System.out.println("greatest number is " + Math.max(num1,num2));
    
        }
    
}
