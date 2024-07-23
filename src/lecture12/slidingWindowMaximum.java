package lecture12;
import java.util.*;
public class slidingWindowMaximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0 ;i < n;i++) {
        	arr[i] = scn.nextInt();
        }
        
        int k = scn.nextInt();
        
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i=0 ;i < k;i++) {
        	while(dq.size() > 0 && arr[dq.getLast()] < arr[i]) {
        		dq.removeLast();
        	}
        	dq.addLast(i);
        }
        
        System.out.println(arr[dq.peek()]);
        
        for(int i=k ;i < arr.length;i++) {
        	while(dq.size() > 0 && arr[dq.getLast()] < arr[i]) {
        		dq.removeLast();
        	}
        	
        	dq.addLast(i);
            
        	if(dq.peek() < i - k) {
        		dq.removeFirst();
        	}
        	
        	System.out.println(arr[dq.peek()]);
        }
        
        
	}

}
