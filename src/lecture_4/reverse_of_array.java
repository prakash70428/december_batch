package lecture_4;
import java.util.*;
public class reverse_of_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n;i++) {
        	arr[i] = scn.nextInt();
        }
        
        reverse(arr , 0 ,n - 1);
        
        for(int i=0; i < n;i++) {
        	System.out.println(arr[i]);
        }
	}
	
	public static void reverse(int[] arr,int left,int right) {
		while(left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			
			left++;
			right--;
		}
	}

}
