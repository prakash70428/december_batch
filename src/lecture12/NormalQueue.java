package lecture12;
import java.util.*;
public class NormalQueue {

	public static class CustomQueue{
		int[] data;
		int front;
		int size;
		
		public CustomQueue(int cap) {
			data = new int[cap];
			front = 0;
			size = 0;
		}
		
		int size() {
			return size;
		}
		
		void display() {
			for(int i=0 ;i < size ;i++) {
				System.out.println(data[(front+i) % data.length]);
			}
		}
		
		void add(int val) {
			if(size == data.length) {
				System.out.println("Queue Overflow");
				return;
			}
			
			int rear = (front + size) % data.length;
		    data[rear] = val;
		    size++;		
		}
		
		int remove() {
			if(size == 0) {
				System.out.println("Queue Underflow");
				return -1;
			}
			
			int rv = data[front];
			front = (front + 1) % data.length;
			size--;
			return rv;
		}
		
		int peek() {
			if(size == 0) {
				System.out.println("Queue Underflow");
				return -1;
			}
			
			return data[front];
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomQueue q = new CustomQueue(5);
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		q.add(60);
		
		q.display();
	}
}
