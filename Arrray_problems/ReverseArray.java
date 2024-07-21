import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        Reverse(arr);
        int i =0;
        while(i<arr.length){
            System.out.print(arr[i]+" ");
            i++;
        }
        
    }

    

    public static void Reverse(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start != end){
            if(start>end)
                break;
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++; end--;
        }
        
    }
    
}


/* method 2 => simple method *//* 
public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int i=arr.length-1;
        while(i>=0){
            System.out.print(arr[i] + " ");
            i--;
        }
    }

    
    }
    

*/
