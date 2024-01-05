package lecture_4;
import java.util.*;
public class rotate_a_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        
        int nod = 0;
        int num = n;
        while(num != 0) {
        	num = num / 10;
        	nod++;
        }
        
        k = k % nod;
        if(k < 0) {
        	k = k + nod;
        }
        
        int div = (int)Math.pow(10,k);
        int mult = (int)Math.pow(10,nod - k);
        
        int q = n / div;
        int r = n % div;
        
        int ans = (r * mult) + q;
        
        System.out.println(ans);
	}

}
