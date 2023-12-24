package lecture_2;
import java.util.*;
public class pattern_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int row = 1;
        int spaces = n / 2;
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
        	while(j <= stars) {
        		System.out.print("* ");
        		j++;
        	}
        	
        	//next row prepration
        	
        	if(row < n/2 + 1) {
        		spaces--;
        		stars += 2;
        	}else {
        		spaces++;
        		stars -= 2;
        	}
        	
        	System.out.println();
        	row++;
        }
	}

}
