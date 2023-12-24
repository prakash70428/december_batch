package lecture_1;

import java.util.*;

public class getting_started {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        if(n%2 == 0) {
        	System.out.println("Number is even");
        }else {
        	System.out.println("Number is odd");
        }
	}
}
