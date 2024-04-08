package lecture_9;
import java.util.*;
public class merge_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i < n;i++) {
        	arr[i] = scn.nextInt();
        }
        
        int[] mergeArray = mergeSort(arr,0,n-1);
        display(mergeArray);
	}
	
	public static int[] mergeSort(int[] arr,int left,int right) {
		if(left == right) {
			int[] bans = new int[1];
			bans[0] = arr[left];
			return bans;
		}
		
		int mid = (left + right) / 2;
		int[] fsh = mergeSort(arr,left,mid);
		int[] ssh = mergeSort(arr,mid+1,right);
		
		int[] ans = mergeTwoSortedArray(fsh,ssh);
		return ans;
	}
	
	public static int[] mergeTwoSortedArray(int[] a,int[] b) {
		int[] ans = new int[a.length + b.length];
		
		int i=0,j=0,k=0;
		
		while(i < a.length && j < b.length) {
			if(a[i] < b[j]) {
				ans[k] = a[i];
				i++;
				k++;
			}else {
				ans[k] = b[j];
				j++;
				k++;
			}
		}
		
		while(i < a.length) {
			ans[k] = a[i];
			i++;
			k++;
		}
		
		while(j < b.length) {
			ans[k] = b[j];
			j++;
			k++;
		}
		
		return ans;
	}
	
	public static void display(int[] arr) {
		for(int i=0;i < arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
