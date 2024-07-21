class largest_element_Array{
	public static void main(String []args){

	int arr[] = {3,-2,78,900,1,67,55,34,0,-56};
	int largest = Integer.MIN_VALUE;

	for(int i=0;i<arr.length;i++){
		if(arr[i]>largest)
			largest = arr[i];
	}
	System.out.println("largest element is :"+ largest);

	
	}
}

/* method 2 using recursion */ /*
class largest_element_Array{
	public static void main(String []args){

	int arr[] = {3,-2,78,900,1,67,55,34,0,-56};
	largest_element_Array l1 = new largest_element_Array();


	System.out.println("largest is :"+ l1.getmax(arr, arr.length));
	
	}
	public int getmax(int arr[],int n){
		if(n==1)
			return arr[0];
		return Math.max(arr[n-1], getmax(arr, n-1));

	}
	

	
}*/
