/*using builtin function *//* 

import java.util.Arrays;
public class second_largest {
    public static void main(String[] args) {

        int arr[] = {3,-2,78,900,900,1,67,55,34,0,-56};
        int secondLarge = 0;
        Arrays.sort(arr);

        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]!= arr[arr.length-1]){
                secondLarge = arr[i];
                break;
            }

        }
        System.out.println("second largest is :" + secondLarge);
    } 
}*/

/*   method 1 => using single loop */
public class second_largest {
    public static void main(String[] args) {

        int arr[] = {3,-2,78,78,900,900,1,67,55,34,0,-56};
        System.out.println(SecondLarge(arr));

        
    } 
    public static int SecondLarge(int arr[]){
        int secondLarge= arr[0];
        int largest=arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLarge=largest;
                largest=arr[i];
            }
            else if(arr[i]>secondLarge && arr[i] !=largest){
                secondLarge=arr[i];
            }
        }
        return secondLarge;
    }
}

