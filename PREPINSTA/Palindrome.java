/* 
public class Palindrome {
    public static void main(String[] args) {
        int num = 12021,rev =0;//we also take user input

        int temp = num;

        while(temp!=0){
            int remainder = temp % 10;
            rev = rev*10 + remainder ;
            temp /=10;

        }
        if(rev == num)
            System.out.println("number is palindrome");
        else
            System.out.println("number is not palindrome");
    }
    
}
*/

public class Palindrome {

    public static int reverse(int num,int rev){

        if(num == 0){
            return rev ;
        }
        int remainder = num % 10;
        rev = rev *10 + remainder;
        
        return reverse(num/10, rev);
    }
    public static void main(String[] args) {
        int num = 12021,rev =0;//we also take user input
        
        if( num == reverse(num, rev))
            System.out.println("number is palindrome");
        else
            System.out.println("number is not palindrome");
    }
    
}