/*public class Factors_Of_No{
    public static void main(String[] args) {
        int num = 20;

        for(int i = 1;i<=num;i++){
            if(num%i == 0)
                System.out.print (i+ " ");
        }
        
    }
    
}
*/
//Time Complexity : O(n) 
// Auxiliary Space : O(1)


/* ---------------------------------------------------------better than privous method-------------------------------------------------------------
public class Factors_Of_No{
    public static void main(String[] args) {
        int num = 100;

        for(int i = 1;i<=num/2;i++){
            if(num%i == 0)
                System.out.print (i+ " ");
        }
        System.out.print (num);
        
    }
    
}*/
//Time Complexity : O(n) 
// Auxiliary Space : O(1)


/* ---------------------------------------------------------better than privous method-------------------------------------------------------------*/
public class Factors_Of_No{
    public static void factorsofno(int n){

        for(int i=1 ; i<= Math.sqrt(n) ;i++){
            if(n%i==0){
                if(i== n/i)
                    System.out.print(i+" ");
                 else
                    System.out.print(i+" "+n/i+" ");  
                      }  
        }


    }
    public static void main(String[] args) {
        int num = 30;
        factorsofno(num);
        }
       
        
    }
    // Time Complexity : O(sqrt(N))
// Space Complexity : O(1)
