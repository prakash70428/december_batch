package lecture_2;
import java.util.*;
public class square_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int row = 1;
        int star = n;
        int val = 1;
        while(row <= n) {
        	//star
        	int i = 1;
        	while(i <= star) {
        		System.out.print("* ");
        		i++;
        	}
        	
        	//next row prepration
        	System.out.println();
        	row++;
        }
	}

}
