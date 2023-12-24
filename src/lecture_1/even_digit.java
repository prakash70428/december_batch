package lecture_1;
import java.util.*;
public class even_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        while(n != 0){
        	int rem = n % 10;
        	
        	if(rem % 2 == 0) {
        		System.out.println(rem);
        	}
        	
        	n = n /10;
        }
	}

}
