/* using hashSet class - As it implements set interface ,it don't allows duplicates values  */

import java.util.HashSet;
public class Remove_duplicates {
    public static void main(String[] args) {
        int arr[] = {2,2,2,4,56,7,8,4,56,89,8};
        HashSet <Integer>h1 = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            h1.add(arr[i]);
        }
        System.out.println(h1);
    }
    
}
