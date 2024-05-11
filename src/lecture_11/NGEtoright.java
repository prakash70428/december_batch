package lecture_11;
import java.util.*;
public class NGEtoright {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i < n;i++) {
        	arr[i] = scn.nextInt();
        }
        
        int[] ans = NGEtotheright(arr);
        for(int i=0 ; i < n;i++) {
        	System.out.println(ans[i]);
        }
	}
	
	public static int[] NGEtotheright(int[] arr) {
		int[] ans = new int[arr.length];
		Stack<Integer> st = new Stack<>();
		
		for(int i=arr.length-1;i >= 0;i--) {
			//1. pop all smaller elements
			while(st.size() > 0 && st.peek() < arr[i]) {
				st.pop();
			}
			//2. update answer
			if(st.size() == 0) {
				ans[i] = -1;
			}else {
				ans[i] = st.peek();
			}
			
			//3. push current element to the stack
			st.push(arr[i]);
		}
		
		return ans;
	}

}
