package lecture_1;

import java.util.*;

public class count_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int p = scn.nextInt();
        int r = scn.nextInt();
        int t = scn.nextInt();
        
        int si = (p*r*t) / 100;
        
        System.out.println(si);
	}

}
