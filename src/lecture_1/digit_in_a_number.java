package lecture_1;
import java.util.*;
public class digit_in_a_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int nod = 0;
        int num = n;
        while(num != 0) {
        	num = num / 10;
        	nod++;
        }
         
        int div = (int)Math.pow(10,nod - 1);
        
        while(div != 0) {
        	int q = n / div;
        	int r = n % div;
        	
        	System.out.println(q);
        	n = r;
        	div /= 10;
        }
        
	}

}
