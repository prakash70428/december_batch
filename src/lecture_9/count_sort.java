package lecture_9;
import java.util.*;
public class count_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0 ; i < n;i++) {
        	arr[i] = scn.nextInt();
        	max = Math.max(max,arr[i]);
        	min = Math.min(min,arr[i]);
        }
        
        countSort(arr,min,max);
        display(arr);
	}
	
	public static void countSort(int[] arr,int min,int max) {
		//1.create farr
		int[] farr = new int[max-min+1];
		for(int i=0 ; i < arr.length;i++) {
			farr[arr[i] - min]++;
		}
		
		//2.convert farr into prefixsum Array
		for(int i=1;i < farr.length;i++) {
			farr[i] = farr[i-1] + farr[i];
		}
		
		//3.travel from right to left in original array and fill ans array
		int[] ans = new int[arr.length];
		for(int i=arr.length-1;i >= 0;i--) {
			int pos = farr[arr[i] - min];
			ans[pos - 1] = arr[i];
			farr[arr[i] - min]--;
		}
		
		for(int i=0 ; i < arr.length;i++) {
			arr[i] = ans[i];
		}
	}
	
    public static void display(int[] arr) {
    	for(int i=0 ; i < arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
    }

}
