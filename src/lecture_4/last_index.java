package lecture_4;
import java.util.*;
public class last_index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
	     int n = scn.nextInt();
	     int[] arr = new int[n];
	     for(int i=0;i < n;i++) {
	         arr[i] = scn.nextInt(); 
	      }
	        
	      int data = scn.nextInt();
	      
	      int left = 0;
	      int right = n - 1;
	      int li  = -1;
	      
	      while(left <= right) {
	    	  int mid = (left + right) / 2;
	    	  if(arr[mid] == data) {
	    		  li = mid;
	    		  left = mid + 1;
	    	  }
	    	  else if(arr[mid] > data) {
	    		  right = mid - 1;
	    	  }
	    	  else {
	    		  left = mid + 1;
	    	  }
	      }
	      
	      System.out.println("Last Index:" + li);
	}

}
