package lecture_2;
import java.util.*;
public class pattern_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int row = 1;
        int star = n/2 + 1;
        int space = -1;
        
        while(row <= n) {
        	//star
        	int i = 1;
        	while(i <= star) {
        		System.out.print("* ");
        		i++;
        	}
        	//spaces
        	int j = 1;
        	while(j <= space) {
        		System.out.print("  ");
        		j++;
        	}
        	//star
        	int k = 1;
        	if(row == 1 || row == n) {
        		k = 2;
        	}
        	while(k <= star) {
        		System.out.print("* ");
        		k++;
        	}
        	
        	//next row prepration
        	//mirror concept
        	if(row < n/2 + 1) {
        		star--;
        		space += 2;
        	}else {
        		star++;
        		space -= 2;
        	}
        	
        	row++;
        	System.out.println();
        }
	}

}
