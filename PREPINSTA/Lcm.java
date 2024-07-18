import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        System.out.print("enter two numbers:");
        Scanner x = new Scanner(System.in);
        int a= x.nextInt();
        int b = x.nextInt();

        int lcm =0;
        for(int i = Math.max(a, b);i<=a*b;i++){
            if(i%a==0 && i%b==0){
                lcm =i;
                break;
            }
        }
        System.out.println("Lcm:"+lcm);
    }
    
}

/* method 2 =>increment i with i+max(a,b) *//* 
public class Lcm {
    public static void main(String[] args) {
        System.out.print("enter two numbers:");
        Scanner x = new Scanner(System.in);
        int a= x.nextInt();
        int b = x.nextInt();

        int lcm =0;
        for(int i = Math.max(a, b);i<=a*b;i=i+Math.max(a, b)){
            if(i%a==0 && i%b==0){
                lcm =i;
                break;
            }
        }
        System.out.println("Lcm:"+lcm);
    }
    
}*/



/* method 3 by formula  => (lcm * hcf = num1 * num2) *//* 
public class Lcm {
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

        System.out.println("Lcm :"+ (a*b)/hcf );
        

    }
    
}
*/
