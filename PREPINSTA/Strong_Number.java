import java.util.Scanner;
public class Strong_Number {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = x.nextInt();
        if(IsStrong(num)== true)
            System.out.println("no is strong number");
        else
            System.out.println("it is not an strong number");       
    x.close();   
    }

    public static boolean IsStrong(int num ){
        int temp = num;
        int digit,sum=0;

        while(temp!=0){
            digit =temp % 10;
            sum = sum +factoN(digit);
            temp = temp/10;
        }

        if(num == sum)
            return true;
        else
            return false;    
    }
     
    static int factoN(int n)
    {
        int facto=1;
        for(int i=1;i<=n;i++){
            facto = facto*i ;
        }
        return facto;
     }
    
}
