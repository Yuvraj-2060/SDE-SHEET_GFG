#Approach-1 =========================***********==============================
package SDE_sheet;
import java.util.*;
public class Leaders {
	public static void findLeader(int arr[],int n) {
		ArrayList<Integer> l = new ArrayList<Integer>(n);
		
		for(int i=0;i<n;i++) {
			int flag=0;
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j])
					j++;
				if(arr[i]<arr[j]) {
					flag=1;	break;
				}
			}
			if(flag==0) {
				l.add(arr[i]);
			}
		}
			for (Integer element: l)
		         System.out.print(element+" ");
	}
	public static void main(String[] args) {
		int arr[]= {63,70,80,33,33,47,20};
		int n=arr.length;
		findLeader(arr,n);

	}
}

// Time complexity of this code is : O ( n2) which is not good approach

//Approach-2 ================================= ****** ===========================


package SDE_sheet;

public class Leader2
{/* Java Function to print leaders in an array */
	void printLeaders(int arr[], int size)
	{
		int max_from_right = arr[size-1];
/* Rightmost element is always leader */
		System.out.print(max_from_right + " ");
		for (int i = size-2; i >= 0; i--)
		{
			if (max_from_right < arr[i])
			{		
			max_from_right = arr[i];
			System.out.print(max_from_right + " ");
			}
		}
	}

	/* Driver program to test above functions */
	public static void main(String[] args)
	{
		Leader2 lead = new Leader2();
		int arr[] = new int[]{63,70,80,33,33,47,20};
		int n = arr.length;
		lead.printLeaders(arr, n);
	}
}


//Approach-3 ============================= *****(Uisng ArrayList)***** ===========================

package SDE_sheet;
import java.util.*;
public class Leader3 {
	static ArrayList<Integer> leaders(int arr[], int n){
        int max=arr[n-1];
        
        ArrayList<Integer> a = new ArrayList<>(n);
        a.add(max);
        for(int i=n-2;i>=0;i--){
            if(max<=arr[i]){
                max=arr[i];
                a.add(max);
            }
        }Collections.reverse(a);
        return a;
   }
	public static void main(String[] args) {
		int arr[]={63,70,80,33,33,47,20};
		int len=arr.length;
		
		System.out.print(leaders(arr,len));
	}

}
