import java.util.*;
public class ll {

	public static class Node{
		int data;
		Node next;
	}
	public static class linkedlist{
		Node head;
		Node tail;
		int size;
		
		void addLast(int val) {
			Node nn = new Node();
			nn.data = val;
			
			if(size == 0) {
				head = tail = nn;
			}else {
				tail.next = nn;
				tail = nn;
			}
			size++;
		}
		
		void display() {
			Node temp = head;
			while(temp != null) {
				System.out.println(temp.data+" ");
				temp = temp.next;
			}
			System.out.println();
		}
		
		void removeFirst() {
			if(size == 0) {
				System.out.println("List is empty");
			}else if(size == 1) {
				size--;
				head = tail = null;
			}else {
				head = head.next;
				size--;
			}
		}
		
		int getFirst() {
			if(size == 0) {
				System.out.println("List is empty");
				return -1;
			}else {
				return head.data;
			}
		}
		
		int getLast() {
			if(size == 0) {
				System.out.println("List is empty");
				return -1;
			}else {
				return tail.data;
			}
		}
		
		int getAt(int idx) {
			if(idx < 0 || idx >= size) {
				System.out.println("Invalid Arguments");
				return -1;
			}
			else if(size == 0) {
				System.out.println("List is empty");
				return -1;
			}
			else if(idx == 0) {
				return getFirst();
			}
			else if(idx == size - 1) {
				return getLast();
			}
			else {
				Node temp = head;
				for(int i=0 ; i < idx;i++) {
					temp = temp.next;
				}
				
				return temp.data;
			}
		}
		
		void addFirst(int val) {
			Node nn = new Node();
			nn.data = val;
			
			if(size == 0) {
				head = tail = nn;
			}else {
				nn.next = head;
				head = nn;
			}
			size++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linkedlist ll = new linkedlist();
		ll.addLast(10);
		ll.addLast(20);
		ll.addLast(30);
		ll.addLast(40);
		
		//ll.removeFirst();
		System.out.println(ll.getAt(1));
		ll.display();
	}

}
