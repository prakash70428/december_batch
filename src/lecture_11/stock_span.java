package lecture_11;
import java.util.*;
public class stock_span {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0 ;i < n;i++) {
        	arr[i] = scn.nextInt();
        }
        
        int[] sol = stockSpan(arr);
        for(int i=0;i < sol.length;i++) {
        	System.out.println(sol[i]);
        }
	}
	
	public static int[] stockSpan(int[] arr) {
		int[] ans = new int[arr.length];
		Stack<Integer> st = new Stack<>();
		
		for(int i=0 ;i < arr.length;i++) {
			//pop all smaller elements
			while(st.size() > 0 && arr[st.peek()] < arr[i]) {
				st.pop();
			}
			//update your answer
			if(st.size() == 0) {
				ans[i] = i - (-1);
			}else {
				ans[i] = i - st.peek();
			}
			//push current index in the stack
			st.push(i);
		}
		
		return ans;
	}

}
