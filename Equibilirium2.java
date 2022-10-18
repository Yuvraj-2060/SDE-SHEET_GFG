# Approach 1 : ============================================ (Time complexity is : O(n)) =======================================================
public class Equibilirium2 {
	
	// Finds an element in an array such that
	// left and right side sums are equal
	static int findElement(int arr[], int n)
	{
		// Forming prefix sum array from 0
		int[] prefixSum = new int[n];
		prefixSum[0] = arr[0];
		for (int i = 1; i < n; i++)
			prefixSum[i] = prefixSum[i - 1] + arr[i];
	
		// Forming suffix sum array from n-1
		int[] suffixSum = new int[n];
		suffixSum[n - 1] = arr[n - 1];
		for (int i = n - 2; i >= 0; i--)
			suffixSum[i] = suffixSum[i + 1] + arr[i];
	
		// Find the point where prefix and suffix
		// sums are same.
		for (int i = 1; i < n - 1; i++)
			if (prefixSum[i] == suffixSum[i])
				return arr[i];
	
		return -1;
	}
	
	
	public static void main(String args[])
	{
		int arr[] = { 2,3,4,1,4,5 };
		int n = arr.length;
		System.out.println(findElement(arr, n));
	}
}

# Approach 2 : ============================================ (Time complexity is : O(n^2)) =======================================================

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


