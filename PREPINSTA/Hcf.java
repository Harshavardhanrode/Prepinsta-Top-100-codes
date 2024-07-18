import java.util.Scanner;

public class Hcf {
    public static void main(String[] args) {
        System.out.print("enter two numbers:");
        Scanner x = new Scanner(System.in);
        int a= x.nextInt();
        int b = x.nextInt();
        int hcf=0;
        for(int i=1;i<=Math.min(a, b);i++){
            if(a%i==0 && b%i==0)
                hcf = i;
        }
        System.out.println("hcf is :"+hcf);
      
    }
    
}


/*method 2 => by substraction method */
/* 
public class Hcf {
    public static void main(String[] args) {
        System.out.print("enter two numbers:");
        Scanner x = new Scanner(System.in);
        int a= x.nextInt();
        int b = x.nextInt();
        int hcf=0;
        
        while(a!=b){
            if(a>b)
                a=a-b;
            else
                b=b-a;    
        }
        System.out.println("hcf is:"+a);
      
    }
    
}*/




/* 

class Hcf
{
    public static void main (String[]args)
    {
        System.out.print("enter two numbers:");
        Scanner x = new Scanner(System.in);
        int a= x.nextInt();
        int b = x.nextInt();
        int hcf;
            hcf = getHCF (a, b);
            System.out.println ("The HCF: " + hcf);
    }

    static int getHCF (int a, int b)
    {
        return b == 0 ? a : getHCF (b, a % b);
    }
}
*/