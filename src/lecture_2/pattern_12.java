package lecture_2;

import java.util.Scanner;

public class pattern_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		  int row = 1;
	        int spaces = n - 1;
	        int stars = 1;
	       
	        while(row <= n) {
	        	//spaces
	        	int i = 1;
	        	while(i <= spaces) {
	        		System.out.print("  ");
	        		i++;
	        	}
	        	//stars
	        	int j = 1;
	        	int val = 1;
	        	while(j <= stars) {
	        		System.out.print(val + " ");
	        		val++;
	        		j++;
	        	}
	        	
	        	//next row prepration
	        	row++;
	        	System.out.println();
	        	spaces--;
	        	stars += 2;
	        }
	}

}
