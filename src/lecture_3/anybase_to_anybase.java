package lecture_3;
import java.util.*;
public class anybase_to_anybase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourcebase = scn.nextInt();
        int destnbase = scn.nextInt();
        
        int decno = anybasetod(n , sourcebase);
        int ans = dtoanybase(decno , destnbase);
        System.out.println(ans);
	}
	public static int anybasetod(int n ,int b) {
		int ans = 0;
		int power = 1;
		
		while(n != 0) {
			int ld = n % 10;
			n = n / 10;
			
			ans += (ld * power);
			power *= b;
		}
		
		return ans;
	}
	public static int dtoanybase(int n,int b) {
		int ans = 0;
		int power = 1;
		
		while(n != 0) {
			int r = n % b;
			n = n / b;
			
			ans += (r * power);
			power *= 10;
		}
		
		return ans;
	}

}
