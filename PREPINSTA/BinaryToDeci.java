//binary to decimal conversion
import java.util.Scanner;

public class BinaryToDeci{
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("enter your number");
        int binary = x.nextInt();
        int decimal =0;
        int power=0;

        while(binary>0){
            int temp = binary%10;
            decimal += temp*Math.pow(2, power);
            binary=binary/10;
            power++;
        }
        System.out.println("decimal no : "+ decimal);
        x.close();
    }
    
    

    
}
    
