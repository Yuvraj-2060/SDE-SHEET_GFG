//{ Driver Code Starts
import java.util.*;

class MaxLenZeroSumSub
{

    // Returns length of the maximum length subarray with 0 sum

    // Drive method
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            GfG g = new GfG();
            System.out.println(g.maxLen(arr, n));
            T--;
        }
    }
}
// } Driver Code Ends


class GfG
{
    int maxLen(int arr[], int n)
    {
       int max_len=0,zcnt=0;
		for(int i=0;i<n;i++) {
			int cur_sum=0;
			for(int j=i;j<n;j++) {
				cur_sum=cur_sum+arr[j];
				if (cur_sum == 0)
                    max_len = Math.max(max_len, j - i + 1);
				if(arr[j]==0)
					zcnt++;
			}
			
		}if(zcnt>0 && max_len==0)
			return 1;
		return max_len;
    } 
}
