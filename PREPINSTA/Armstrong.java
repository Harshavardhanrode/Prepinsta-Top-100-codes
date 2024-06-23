public class Armstrong {
    static int order(int num)
    {
        int len=0;
        while (num !=0) {
            num /=10;
            len++;   
        }
        return len;
    }
    static int A_rmstrong(int num,int length){
        int sum =0;
        while(num!=0){
            int remainder= num%10;
            sum += Math.pow(remainder, length);
            num /=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int num = 371;

        int length = order( num);
        
        if(num == A_rmstrong(num,length))
            System.out.println("number is armstrong");
        else
            System.out.println("number is not armstrong");    
    }
    
}
