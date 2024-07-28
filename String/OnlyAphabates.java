public class OnlyAphabates {
    public static void main(String[] args) {
        String s=" #$%hdfek=";
        String s1 ="";
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>'A'&& s.charAt(i)<'Z')||(s.charAt(i)>'a'&& s.charAt(i)<'z'))
                s1 = s1+s.charAt(i);
        }
        System.out.println(s1);

    }
    
    
}
