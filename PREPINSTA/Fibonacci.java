/* //simple method-----------------------------------------------------------------------------------------------
public class Fibonacci {
    public static void main(String[] args) {
        int n=15,a=0,b=1;

        System.out.print("fibonacci series of "+ n+ "numbers are :"+ a + " "+ b );

        for(int i=2;i<n;i++){
            int nextterm = a+b;
            a=b;
            b = nextterm;
            System.out.print(" "+nextterm);
            
        }
    }
    
}*/


//using function ---------------------------------------------------------------------------------------------------------
public class Fibonacci {
    public static void fibonacci(int n,int a,int b){
        int c =0 ;
        if(n==0)
            return;

        c= a+b;
        System.out.print(" "+c);
        fibonacci(n-1,b,c);
    }
    public static void main(String[] args) {
        int n=15,a=0,b=1;
        System.out.print(a+" "+ b);
        fibonacci(n-2, a, b);
        
            
        }
    }
    


