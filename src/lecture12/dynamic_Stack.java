package lecture12;
import java.util.*;

public class dynamic_Stack {

	public static class CustomStack{
		int[] data;
		int tos;
		
		public CustomStack(int cap) {
			data = new int[cap];
			tos = -1;
		}
		
		int size() {
			return tos + 1;
		}
		
		void display() {
			for(int i=tos ;i >= 0;i--) {
				System.out.println(data[i] + " ");
			}
		}
		
		void push(int val) {
			if(tos == data.length - 1) {
				int[] oa = data;
				data = new int[2 * oa.length];
				for(int i=0 ; i < oa.length;i++) {
					data[i] = oa[i];
				}
			}
			
			tos++;
			data[tos] = val;
		}
		
		int pop() {
			if(tos == -1) {
				System.out.println("Stack Underflow");
				return -1;
			}
			
			int rv = data[tos];
			tos--;
			return rv;
		}
		
		int top() {
			if(tos == -1) {
				System.out.println("Stack Underflow");
				return -1;
			}
			
			int rv = data[tos];
			return rv;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomStack st = new CustomStack(5);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        
        st.display();
	}

}
