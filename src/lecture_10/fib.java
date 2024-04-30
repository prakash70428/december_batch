package lecture_10;
import java.util.*;
public class fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
//        int[] dp = new int[n + 1];
//        System.out.println(fibMemorization(n,dp));
        System.out.println(fibTabulation(n));
        
	}
	
	public static int fib(int n) {
		if(n == 0 || n == 1) {
			return n;
		}
		
		int fnm1 = fib(n - 1);
		int fnm2 = fib(n - 2);
		
		int fn = fnm1 + fnm2;
		return fn;
	}
	
	public static int fibMemorization(int n,int[] dp) {
		if(n == 0 || n == 1) {
			return n;
		}
		if(dp[n] != 0) {
			return dp[n];
		}
		
		int fnm1 = fibMemorization(n - 1,dp);
		int fnm2 = fibMemorization(n - 2,dp);
		
		int fn = fnm1 + fnm2;
		dp[n] = fn;
		return fn;
	}

	public static int fibTabulation(int n) {
		int[] dp = new int[n + 1];
		dp[0] = 0;
		dp[1] = 1;
		
		for(int i=2;i <= n;i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		
		return dp[n];
	}
}
