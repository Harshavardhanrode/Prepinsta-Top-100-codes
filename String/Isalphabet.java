public class Isalphabet {
    public static void main(String []args){
        char ch ='-';

        if((ch>=65 && ch<=90) || (ch>=97 && ch<=122))
            System.out.println("Alphabet");
        else
            System.out.println("not an alphabet");    
    }
    
}


/* mathod 2 => buildin function *//* 
public class Isalphabet {
    public static void main(String []args){
        char ch ='i';

         boolean value =Character.isAlphabetic(ch);  
         System.out.println(value); 
    }
    
}*/