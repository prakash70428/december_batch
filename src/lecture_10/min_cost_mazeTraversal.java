package lecture_10;
import java.util.*;
public class min_cost_mazeTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0;i < n;i++) {
        	for(int j=0 ; j < m;j++) {
        		arr[i][j] = scn.nextInt();
        	}
        }
        
//        int[][] dp = new int[n][m];
//        System.out.println(minCost(arr,0,0,dp));
        
        System.out.println(minCostTab(arr));
	}
	
	public static int minCost(int[][] arr,int sr,int sc,int[][] dp) {
		if(sr >= arr.length || sc >= arr[0].length) {
			return Integer.MAX_VALUE;
		}
		if(sr == arr.length-1 && sc == arr[0].length-1) {
			return arr[sr][sc];
		}
		if(dp[sr][sc] != 0) {
			return dp[sr][sc];
		}
		
		int f1 = minCost(arr,sr,sc+1,dp);
		int f2 = minCost(arr,sr+1,sc,dp);
		int ans = Math.min(f1, f2) + arr[sr][sc];
		
		dp[sr][sc] = ans;
		return ans;
	}
	
	public static int minCostTab(int[][] arr) {
		int[][] dp = new int[arr.length][arr[0].length];
		
		for(int i=dp.length-1;i >= 0;i--) {
			for(int j=dp[0].length-1;j >= 0;j--) {
				if(i == dp.length-1 && j == dp[0].length-1) {
					dp[i][j] = arr[i][j];
				}
				else if(i == dp.length - 1) {
					dp[i][j] = dp[i][j+1] + arr[i][j];
				}
				else if(j == dp[0].length - 1) {
					dp[i][j] = dp[i+1][j] + arr[i][j];
				}
				else {
					dp[i][j] = Math.min(dp[i+1][j],dp[i][j+1]) + arr[i][j];
				}
			}
		}
		
		return dp[0][0];
	}

}
