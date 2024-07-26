import java.util.Arrays;

public class Distinct_numbersInArray {
    static int distinct;
    public static void main(String[]args){
        int arr[]= {-2,90,10,20,10,20,10,30,10,10};
        Distinct_numbersInArray n1 = new Distinct_numbersInArray();
        Arrays.sort(arr);
        n1.Findfrequency(arr);
        System.out.println("distinct numbers:"+distinct);
    }

    public  void Findfrequency(int[] arr){
        int visited =0,count=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]!= visited){
                distinct++;
                if(i!=0)
                    System.out.println(visited+":"+count);
                visited=arr[i];
                count = 1;
                if(arr.length-1==i)
                    System.out.println(visited+":"+count);

            }
            else{count++;}
        }

    }
    
}
