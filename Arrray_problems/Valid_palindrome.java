

public class Valid_palindrome {
    public boolean isPalindrome(String s) {
        String x1= alphanumeric(s);
        System.out.println(x1);

        for(int i=0;i<(x1.length()/2);i++){
            if(x1.charAt(i) != x1.charAt(x1.length()-1-i))
                return false;
        }
        return true;
        
    }
    public static void main(String []args){
        String s = "@Har$h.0 027";
        String s1 = "@har$h.11  h rah"; 
        Valid_palindrome a1=new Valid_palindrome();
        System.out.println(a1.isPalindrome(s1));

    }
    public static String alphanumeric(String s){
        String newstr="";
        for(int i=0;i<s.length();i++){
            boolean b1 = Character.isDigit(s.charAt(i));
            boolean b2 = Character.isAlphabetic(s.charAt(i));

            if(b1 || b2)
                newstr = newstr + s.charAt(i);
        }
        
        return newstr.toLowerCase();
    }
}