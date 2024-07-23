// import java.util.ArrayList;

// public class Frequency_ofNumInArray {
//     public static void main(String[]args){
//         int arr[]= {-2,90,10,20,10,20,10,30,10,10};
//         Frequency_ofNumInArray n1 = new Frequency_ofNumInArray();
//         n1.Findfrequency(arr);
//     }

//     public  void Findfrequency(int[] arr){
//         ArrayList <Integer>visited =new ArrayList<>(); 
//         for(int i=0;i<arr.length;i++){
//             int count=0;
//             if(visited.contains(arr[i]))
//                 continue;
//             visited.add(arr[i]);    
                

//             for(int j=0;j<arr.length;j++){
//                 if(arr[j]==arr[i])
//                     count++;
//             }
//             System.out.println(arr[i]+":"+count);
//         }

//     }
       
    
// }

/* method 2 (using sort()method) */
import java.util.ArrayList;
import java.util.Arrays;

public class Frequency_ofNumInArray {
    public static void main(String[]args){
        int arr[]= {-2,90,10,20,10,20,10,30,10,10};
        Frequency_ofNumInArray n1 = new Frequency_ofNumInArray();
        Arrays.sort(arr);
        n1.Findfrequency(arr);
    }

    public  void Findfrequency(int[] arr){
        int visited =0,count=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]!= visited){
                if(i!=0)
                    System.out.println(visited+":"+count);
                visited=arr[i];
                count = 1;
            }
            else{count++;}
        }

    }
       
    
 }



/*using hashmap time-o(n) *//* 
import java.util.HashMap;
import java.util.Map;

public class Frequency_ofNumInArray {
    public static void main(String[]args){
        int arr[]= {-2,90,10,20,10,20,10,30,10,10};
        Frequency_ofNumInArray n1 = new Frequency_ofNumInArray();
        n1.Findfrequency(arr);
    }

    public  void Findfrequency(int[] arr){
        Map <Integer,Integer>h1 = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(h1.containsKey(arr[i]))
                h1.put(arr[i], h1.get(arr[i]) + 1);
            else{
                h1.put(arr[i], 1);
            }    
        }
        for (Map.Entry<Integer, Integer> entry : h1.entrySet())
        {
             System.out.println(entry.getKey() + ":" + entry.getValue());
        }  

    }
       
    
}*/

