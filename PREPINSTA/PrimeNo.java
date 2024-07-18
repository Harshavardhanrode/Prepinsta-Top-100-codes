public class PrimeNo {
    public static void main(String[] args) {
        int num = 100;

        for(int i = 1;i<num;i++){
            if(isPrime(i))
                System.out.print (i+" ");
        }     
    }

    public static boolean isPrime(int num1){
        int count=0;
        for(int i=1;i<=num1/2;i++){
            if(num1%i==0)
                count++;
        }
        return count==1 ? true:false;        
    }
    
}


/* 
public class PrimeNo {
    public static void main(String[] args) {
        int num = 10;

        for(int i = 2;i<num;i++){
            if(isPrime(i))
                System.out.print (i+" ");
        }     
    }

    public static boolean isPrime(int num1){
        int count=0;
        for(int i=1;i<=Math.sqrt(num1);i++){
            if(num1%i==0)
                count++;
        }
        return count==1 ? true:false;        
    }
    
}*/