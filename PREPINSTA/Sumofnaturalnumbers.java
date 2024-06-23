public class Sumofnaturalnumbers {

   
    public static void main(String[]args)
    {
        int n=15;
        /*                                        //      with for loop;
        int sum = 0;
         
        for(int i=0;i<n;i++)
        {
            sum =sum+i;
        }
        System.out.println(sum);
        */


        /*                                          // with formula
        System.out.println((n*(n+1))/2);
        */

       
                                //recurrsion
        int sum = function(n);
        System.out.println(sum);   
    }
    public static int function(int n)
    {
        if(n==1)
           return 1;
        else
           return n+function(n-1);
    }
    
}
