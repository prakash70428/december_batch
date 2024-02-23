package lecture_7;
import java.util.*;
public class displayArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0 ;i < n;i++) {
        	arr[i] = scn.nextInt();
        }
        
        dispArray(arr,0);
	}
	
	public static void dispArray(int[] arr,int idx) {
		if(idx == arr.length) {
			return;
		}
		
		System.out.println(arr[idx]);
		dispArray(arr,idx+1);
	}

}
