package lecture_9;
import java.util.*;
public class quick_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i < n;i++) {
        	arr[i] = scn.nextInt();
        }
        
        quickSort(arr,0,n-1);
        display(arr);
	}
	
	public static void quickSort(int[] arr,int lo,int hi) {
		if(lo > hi) {
			return;
		}
		
		int pividx = partition_array(arr,arr[hi],lo,hi);
		quickSort(arr,lo,pividx-1);
		quickSort(arr,pividx+1,hi);
	}
	
	//return pivot index
	public static int partition_array(int[] arr,int pivot,int lo,int hi) {
		int i = lo;
		int j = lo;
		
		while(i < arr.length) {
			if(arr[i] <= pivot) {
				swap(arr,i,j);
				i++;
				j++;
			}
			else {
				i++;
			}
		}
		
		return j - 1;
	}
	
	public static void swap(int[] arr,int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void display(int[] arr) {
		for(int i=0 ; i < arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
