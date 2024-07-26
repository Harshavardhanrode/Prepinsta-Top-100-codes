public class circular_rotationArray {
    public static void main(String[] args) {
        int arr[]={4,7,9,2,5,8,0};
        int arrnnew[]= leftrotation(arr, arr.length, 2);

        for(int element : arrnnew) {
            System.out.print(element+" ");
        }
    }

    public static int[] leftrotation(int[] arr, int length,int r) {
        for(int j=0;j<r;j++){
                int temp = arr[0];
                for(int i=0;i<length-1;i++){
                    arr[i] = arr[i+1];
                }
                arr[length-1]= temp;
        }
        return arr;
    }
    
}
