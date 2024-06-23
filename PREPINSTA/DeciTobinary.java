import java.util.Scanner;
public class DeciTobinary {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter your number");
        int decimal =x.nextInt(); 
        
        int []binary = new int[20];
        int i=0;
         while(decimal!=0){
                 
            binary[i] = decimal % 2;
            decimal=decimal/2;
            i++;
            
         } 
         for(int j=i-1;j>=0;j--)
         {
            System.out.print(binary[j]);
         }      
    }
    
}
