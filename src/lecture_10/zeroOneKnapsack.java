package lecture_10;
import java.util.*;
public class zeroOneKnapsack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
        int[] prices = new int[n];
        for(int i=0 ; i < n;i++) {
        	prices[i] = scn.nextInt();
        }
        
        int[] wts = new int[n];
        for(int i=0 ; i < n;i++) {
        	wts[i] = scn.nextInt();
        }
        
        int capacity = scn.nextInt();
        
        System.out.println(ZeroOneKnapsack(prices,wts,capacity));
	}
	
	public static int ZeroOneKnapsack(int[] prices,int[] wts,int cap) {
		int[][] dp = new int[prices.length+1][cap+1];
		
		for(int i=1;i < dp.length;i++) {
			for(int j=1; j < dp[0].length;j++) {
				dp[i][j] = dp[i - 1][j] ; //no
				if(j - wts[i-1] >= 0) {
					dp[i][j] = Math.max(dp[i][j],prices[i-1] + dp[i-1][j - wts[i-1]]);	
				}
			}
		}
		
		return dp[dp.length-1][dp[0].length-1];
	}

}
