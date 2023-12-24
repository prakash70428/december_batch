package lecture_2;
import java.util.*;
public class pattern_6 {

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
        	while(j <= stars) {
        		if(j % 2 == 0) {
        			System.out.print("! ");
        		}else {
        			System.out.print("* ");
        		}
        		j++;
        	}
        	
        	//next row prepration
        	row++;
        	System.out.println(); //enter
            spaces--;
            stars += 2;
        	
        }
	}

}
