package lecture_10;
import java.util.*;
public class climb_stairs_with_jumps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0 ;i < n;i++) {
        	arr[i] = scn.nextInt();
        }
        
//        int[] dp = new int[n+1];
//        System.out.println(CSjump(arr,0,dp));
        
        System.out.println(CSjumpTab(arr));
	}
	public static int CSjump(int[] arr,int idx,int[] dp) {
		if(idx == arr.length) {
			return 1;
		}
		if(idx > arr.length) {
			return 0;
		}
		if(dp[idx] != 0) {
			return dp[idx];
		}
		
		int ans = 0;
		for(int jump=1;jump <= arr[idx];jump++) {
			ans += CSjump(arr,idx+jump,dp);
		}
		
		dp[idx] = ans;
		return ans;
	}
	
	public static int CSjumpTab(int[] arr) {
		int n = arr.length;
		int[] dp = new int[n+1];
		
		dp[n] = 1; //dest -> dest
		for(int i=n-1;i >= 0;i--) {
			for(int jump=1;jump <= arr[i];jump++) {
				if(i+jump <= n) {
					dp[i] += dp[i+jump];
				}
				
			}
		}
		
		return dp[0];
	}

}
