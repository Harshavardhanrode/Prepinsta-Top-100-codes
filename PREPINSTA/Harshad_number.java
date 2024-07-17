/* if sum of digit is divisible by num thenit is harshad number */
public class Harshad_number {
    public static void main(String[] args) {
        int n=100;
        int sum=0;

        int temp = n;
        while (temp!=0){
            int rem = temp%10;
            sum=sum+rem;
            temp/=10;
        }
        if(n%sum==0)
            System.out.println("harshad number");
        else
            System.out.println("not an harshad number");    

    }
    
}
