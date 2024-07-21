/* to sort half part in ascending and half part in descending order */
public class HalfA_HalfD_sorting {
    public static void main(String[] args) {
        int arr[] ={ 2,1,6,7,67,34,50};
        int new_arr[] =Half_sorting(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(new_arr[i]+" ");
        }
    }

    public static int[] Half_sorting(int[] arr) {
        int half_length = arr.length/2;
        System.out.println(half_length);
        for(int i=0;i<half_length;i++){

            for(int j=0;j<half_length-1;j++){
                if(arr[j]>arr[j+1]){
                   
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

            for(int j=half_length;j<arr.length-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
        }
        
    }
    

