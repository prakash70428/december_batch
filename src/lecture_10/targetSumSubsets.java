package lecture_10;
import java.util.*;
public class targetSumSubsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i < n;i++) {
        	arr[i] = scn.nextInt();
        }
        
        int target = scn.nextInt();
//        Boolean[][] dp = new Boolean[n + 1][target + 1];
//        System.out.println(tss(arr,0,target,dp));
        
        System.out.println(tssTab(arr,target));
	}
	
	public static boolean tss(int[] arr,int idx,int target,Boolean[][] dp) {
		if(target == 0) {
			return true;
		}
		
		if(idx >= arr.length || target < 0) {
			return false;
		}
		
		if(dp[idx][target] != null) {
			return dp[idx][target];
		}
		
		boolean f1 = tss(arr , idx + 1 , target,dp);
		boolean f2 = tss(arr, idx + 1, target - arr[idx],dp);
		
		boolean ans = f1 || f2;
		dp[idx][target] = ans;
		return ans;
	}
	
	public static boolean tssTab(int[] arr,int target) {
		boolean[][] dp = new boolean[arr.length+1][target+1];
		
		for(int i=0 ;i < dp.length;i++) {
			dp[i][0] = true;
		}
		
		for(int i=1;i < dp.length;i++) {
			for(int j=1;j < dp[0].length;j++) {
				dp[i][j] = dp[i - 1][j]; //no
				if(dp[i][j] == false && j - arr[i - 1] >= 0) {
					dp[i][j] = dp[i - 1][j - arr[i - 1]]; //yes
				}
			}
		}
		
		return dp[dp.length-1][dp[0].length-1];
	}

}
