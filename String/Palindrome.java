public class Palindrome {
    public static void main(String[] args) {
        String s = "sdf0fd8s";
        int x=0;

        for(int i=0;i<s.length()/2;i++){
            if(!(s.charAt(i)==s.charAt(s.length()-1-i))){
                System.out.println("not palindrome");
                x=1;
                break;
            }
        }
        if(x==0)
            System.out.println("palindrome");
    }
    
}
