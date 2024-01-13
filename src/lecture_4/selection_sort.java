package lecture_4;
import java.util.*;
public class selection_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i < n;i++) {
        	arr[i] = scn.nextInt();
        }
        
        selectionSort(arr);
        display(arr);
	}
	
	public static void selectionSort(int[] arr) {
		for(int i=0 ; i < arr.length - 1;i++) {
			int minidx = i;
			for(int j = i + 1;j < arr.length;j++) {
				if(isSmaller(arr,j,minidx) == true) {
					minidx = j;
				}
			}
			
			swap(arr , i , minidx);
		}
	}
	
	//return true if ith element is smaller than jth element
		public static boolean isSmaller(int[] arr,int i,int j) {
			if(arr[i] < arr[j]) {
				return true;
			}else {
				return false;
			}
		}
		
		//used for swapping ith and jth elements of array
		public static void swap(int[] arr,int i,int j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		
		public static void display(int[] arr) {
			for(int i=0 ; i < arr.length;i++) {
				System.out.println(arr[i]);
			}
		}

}
