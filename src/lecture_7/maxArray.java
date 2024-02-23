package lecture_7;
import java.util.*;
public class maxArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0 ;i < n;i++) {
        	arr[i] = scn.nextInt();
        }
        
        System.out.println(maxArray(arr,0));
	}
	
	public static int maxArray(int[] arr,int idx) {
		  if(idx == arr.length) {
			  return Integer.MIN_VALUE;
		  }
		  
//		  if(idx == arr.length - 1) {
//			  return arr[idx];
//		  }
		
		  int f1 = maxArray(arr,idx+1);
		  int max = Math.max(f1,arr[idx]);
		  return max;
	}

}
