import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class xyz {

    public static void main(String[] args) {
        int arr[] = {1,1,-2,2, 2, 3, 4,4,4, 5,5,-3};
        Arrays.sort(arr);
        elementFrequency(arr);

                

    }

    private static void elementFrequency(int[] arr) {
        int count = 1;
            int distinct=0;
        for(int i=1;i<arr.length;i++) {
            
            if(arr[i]==arr[i-1]){
                count++;

            }else{
                System.out.println(arr[i-1] + " occurs " + count );
                distinct++;
                count = 1;
            }

            
            }
        System.out.println(arr[arr.length-1] + " occurs " + count);
        distinct++;
        System.out.println("Total distinct elements: " + distinct);
            
    }
        
    }

    
    


   
     

