

public class VowelOrConsonant {
    public static void main(String[] args){
        char x='Q';
        x = Character.toUpperCase(x);
        if(x>64 && x<91){   // condition for alphabet
            if( x=='A' || x=='E'||x=='O'||x=='I'||x=='U')
                 System.out.println("vowel");
            else
                System.out.println("consonant"); 
        }
        else
            System.out.println("not an aplabet");  
               
    }
    
}
