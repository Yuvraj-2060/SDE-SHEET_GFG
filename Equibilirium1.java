# Approach ================================ ******* ===========================================

package SDE_sheet;

public class Equibilirium1 {
	static int findElement(int arr[]) {
		int n=arr.length;
		
		for(int e=0;e<n;e++) {
			long lsum=0,rsum=0;
			for(int i=0;i<e;i++) 
				lsum=lsum+arr[i];
			
			for(int j=e+1;j<n;j++)
				rsum=rsum+arr[j];
			
			if(lsum==rsum) 
				return arr[e];
		}
			
		return -1;
	}
	public static void main(String[] args) {
		 int arr[]= {2,3,4,1,4,5};
		 System.out.println(findElement(arr));

	}

}

#Approach  ==================================== ****** ===========================================
  
  // Java program to find an element
// such that sum of right side element
// is equal to sum of left side
public class GFG {
	
	// Function to compute partition
	static int findElement(int arr[], int size)
	{
		int right_sum = 0, left_sum = 0;
	
		// Computing right_sum
		for (int i = 1; i < size; i++)
			right_sum += arr[i];
	
		// Checking the point of partition
		// i.e. left_Sum == right_sum
		for (int i = 0, j = 1; j < size; i++, j++) {
			right_sum -= arr[j];
			left_sum += arr[i];
	
			if (left_sum == right_sum)
				return arr[i + 1];
		}
	
		return -1;
	}
	
	// Driver
	public static void main(String args[])
	{
		int arr[] = { 2, 3, 4, 1, 4, 5 };
		int size = arr.length;
		System.out.println(findElement(arr, size));
	}
}

