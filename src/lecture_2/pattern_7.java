package lecture_2;
import java.util.*;
public class pattern_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int row = 1;
        int stars = 1;
        int spaces = 2*n - 3;
        
        while(row <= n) {
        	//stars
        	int i = 1;
        	while(i <= stars) {
        		System.out.print("* ");
        		i++;
        	}
        	
        	//spaces
        	int j = 1;
        	while(j <= spaces) {
        		System.out.print("  ");
        		j++;
        	}
        	
        	//stars
        	int k = 1;
        	if(row == n) {
        		k = 2;
        	}
        	while(k <= stars) {
        		System.out.print("* ");
        		k++;
        	}
        	
        	//next row prepration
        	row++;
        	System.out.println();
        	stars++;
        	spaces -= 2;
        }
	}

}
