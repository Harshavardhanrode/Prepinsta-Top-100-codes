//binary to decimal conversion
import java.util.Scanner;

public class OctalToDeci{
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("enter your number");
        int octal = x.nextInt();
        int decimal =0;
        int power=0;

        while(octal>0){
            int temp = octal % 10;
           decimal += temp*Math.pow(8, power);
            octal = octal/10;
            power++;
        }
        System.out.println("octal no : "+ decimal);
        x.close();
    }
    
    

    
}
    

