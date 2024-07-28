
public class SumOfDgt_InArray {
    public static void main(String[] args) {
    String str="44mn6b8kbn3v2ujv";
    int sum=0;
    for(int i=0;i<str.length();i++){ 
        if(str.charAt(i)>='0' && str.charAt(i)<='9')
            sum+=(str.charAt(i)-'0');
     }
        System.out.println("Sum : " +sum );
    }
}

/* 
public class SumOfDgt_InArray {
    public static void main(String[] args) {
    String str="44mn6b8kbn3v2ujv";
    int sum=0;
    for(int i=0;i<str.length();i++){ 
        if(Character.isDigit(str.charAt(i)))
            sum+=(Character.getNumericValue(str.charAt(i)));
     }
        System.out.println("Sum : " +sum );
    }
}*/