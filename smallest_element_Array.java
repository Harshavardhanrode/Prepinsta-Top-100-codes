import java.lang.Math;


class smallest_element_Array{
	public static void main(String []args){

	int arr[] = {3,-2,78,900,1,67,55,34,0,-56};
	int smallest = Integer.MAX_VALUE;

	for(int i=0;i<arr.length;i++){
		if(arr[i]<smallest)
			smallest = arr[i];
	}
	System.out.println("smallest element is :"+ smallest);

	
	}
}

/* method 2 - recursion*//* 
class smallest_element_Array{
	public static void main(String []args){

	int arr[] = {3,-2,78,900,1,67,55,34,0,-56};
	

	}
	public int getmin(int arr[],int n){
		if(n==1)
		   return arr[0];
		return Math.min(arr[n-1],getmin(arr,n-1));
	}
}*/