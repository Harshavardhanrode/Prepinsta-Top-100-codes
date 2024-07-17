/*automorphic number =>  unit place digit of number and its square is same then it is termed as automorphic number   ex.5 &26  ,16&256*/
public class Automorphic_number {
    public static void main(String[] args) {
        int num = 16;
        int square = num*num;
        if(num%10 == square%10)
            System.out.println("Automorphic number");
        else
            System.out.println("not an Automorphic number");    
        
    }
}
