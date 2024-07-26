public class ReverseString {
    public static void main(String[] args) {
        String s = "harssdfh";
        System.out.println(reverse(s));
    }

    private static String reverse(String s) {
        String rev ="";

        for(int i=s.length()-1;i>=0;i--){
            rev = rev + s.charAt(i);
        }
        return rev;
        
    }
    
}
