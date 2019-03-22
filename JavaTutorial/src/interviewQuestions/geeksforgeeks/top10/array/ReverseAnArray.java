package interviewQuestions.geeksforgeeks.top10.array;

public class ReverseAnArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8};
		arr = reverse(arr);
		for(int i=0;i< arr.length;i++)
			System.out.print(arr[i]);
	}
	
	public static int[] reverse(int[] arr) {
		
		int size = arr.length;
		
		for(int i=0;i<size/2;i++) {
			
			int temp = arr[size-1-i];
			arr[size-1-i] = arr[i];
			arr[i] = temp;
			
		}
		
		
		return arr;
		
	}
	
	
	
}
