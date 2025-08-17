package pack.sort;

public class Bubble {
 public static void main(String[] args) {
	int[] arr = {12,1,34,5,56,14,2,46,34};
	int n =arr.length;
	int temp=0;
	for(int i=0;i<n;i++) {
		for(int j=i+1;j<n;j++) {
			if(arr[i]>arr[j]) {
				temp=arr[i]; // temp = 12
				arr[i] = arr[j]; //arr[0] = 1
				arr[j] = temp;  //arr[1] = 12
			}
		}
	}
	
	for(int i=0;i<n;i++) {
		System.out.print(arr[i]+" ");
	}
		
} 
 
}
