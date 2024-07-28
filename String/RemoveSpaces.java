// public class RemoveSpaces {
//     public static void main(String []args){
//         String s= " harsh var  dhan rode";
//         char a[] = s.toCharArray();
//         StringBuilder b1 = new StringBuilder();

//         for(int i=0;i<a.length;i++){
//             if(a[i]==' ' || a[i]=='\t')
//                 continue;
               
//             b1.append(a[i]);    
//         }
//         System.out.println(b1);


//     }



    
    
// }



public class RemoveSpaces {
public static void main(String[] args) {
    String str="Prep ins t a ";
    str=str.replaceAll(" ","");
    System.out.println(str);
    }
}