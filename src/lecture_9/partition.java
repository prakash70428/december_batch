package lecture_9;
import java.util.*;
public class partition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i < n;i++) {
        	arr[i] = scn.nextInt();
        }
        
        int pivot = scn.nextInt();
        
        partition_array(arr,pivot);
        display(arr);
	}
	
	public static void partition_array(int[] arr,int pivot) {
		int i = 0;
		int j = 0;
		
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
