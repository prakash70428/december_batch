package lecture_1;
import java.util.*;
public class N_natural_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int sum = 0;
        
        for(int i=1; i <= n;i=i+1) {
        	sum = sum + i;
        }
        
        System.out.println(sum);
        
	}

}
