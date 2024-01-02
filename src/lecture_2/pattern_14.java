package lecture_2;
import java.util.*;
public class pattern_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int row = 1;
        int spaces = n / 2;
        int stars = 1;
        int val = 1;
        
        while(row <= n) {
        	//spaces
        	int i = 1;
        	while(i <= spaces) {
        		System.out.print("  ");
        		i++;
        	}
        	
        	//stars 
        	int j = 1;
        	int p = val;
        	while(j <= stars) {
        		System.out.print(p + " ");
        		//vertical concept
        		if(j < stars/2 + 1) {
        			p++;
        		}else {
        			p--;
        		}
        		
        		j++;
        	}
        	
        	//next row prepration
        	//mirror concept
        	if(row < n/2 + 1) {
        		spaces--;
        		stars += 2;
        		val++;
        	}else {
        		spaces++;
        		stars -= 2;
        		val--;
        	}
            
        	System.out.println();
        	row++;
        }
	}

}
