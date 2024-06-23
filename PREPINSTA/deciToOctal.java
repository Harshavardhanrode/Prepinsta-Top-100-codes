import java.util.Scanner;
public class deciToOctal { 

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter your number");
        int octal =x.nextInt(); 
        
        int []binary = new int[20];
        int i=0;
         while(octal!=0){
                 
            binary[i] = octal % 8;
            octal=octal/8;
            i++;
            
         } 
         for(int j=i-1;j>=0;j--)
         {
            System.out.print(binary[j]);
         }      
    }
    

    
}
