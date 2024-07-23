public class longest_palindrome {
    public static void main(String[] args) {
        int arr[] = {121,5656,90009,888888,7},i=0,higest_indx=0,index=0;
        
        while(i<arr.length){
          if(higest_indx< reverse(arr[i],0)) {
            higest_indx = reverse(arr[i],0);
            index=i;
          }
          i++;
        }
        System.out.println("largest palindrome is:" + arr[index]);
    }
        
        public static int reverse(int num,int rev){
            int temp = num;
            int count=0;
            while(temp!=0){
                count++;
                int remainder = temp % 10;
                rev = rev*10 + remainder;
                temp /=10;
            }
            if(rev==num){
                return count;
            }
            return -1;
        
    }
    

}
