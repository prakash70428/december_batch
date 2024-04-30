package lecture_9;
import java.util.*;
public class radix_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i < n;i++) {
        	arr[i] = scn.nextInt();
        }
        
        radixSort(arr);
        for(int i=0 ; i < n;i++) {
        	System.out.println(arr[i]);
        }
	}
	
	public static void radixSort(int[] arr) {
		int max = 0;
		for(int i=0 ; i < arr.length;i++) {
			max = Math.max(max,arr[i]);
		}
		
		int counter = 0;
		while(max != 0) {
			max = max / 10;
			countSort(arr,(int)Math.pow(10,counter));
			counter++;
		}
	}
	
	public static void countSort(int[] arr,int exp) {
		//1.create farr
		int[] farr = new int[10];
		for(int i=0 ; i < arr.length;i++) {
			farr[(arr[i]/exp) % 10]++;
		}
		
		//2.convert farr into prefixsum Array
		for(int i=1;i < farr.length;i++) {
			farr[i] = farr[i-1] + farr[i];
		}
		
		//3.travel from right to left in original array and fill ans array
		int[] ans = new int[arr.length];
		for(int i=arr.length-1;i >= 0;i--) {
			int pos = farr[(arr[i]/exp) % 10];
			ans[pos - 1] = arr[i];
			farr[(arr[i]/exp) % 10]--;
		}
		
		for(int i=0 ; i < arr.length;i++) {
			arr[i] = ans[i];
		}
	}

}
