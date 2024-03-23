package lecture_8;
import java.util.*;
public class target_sum_subsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i < n;i++) {
        	arr[i] = scn.nextInt();
        }
        
        int target = scn.nextInt();
        printTargetsumSubsets(arr,0,"",0,target);
	}
	
	public static void printTargetsumSubsets(int[] arr,int idx,String asf,int ssf,int target) {
		if(ssf > target) {
			return;
		}
		
		if(idx == arr.length) {
			if(ssf == target) {
				System.out.println(asf + " ");
			}
			return;
		}
		
		//yes
		printTargetsumSubsets(arr,idx+1,asf + arr[idx] + ",",ssf + arr[idx],target);
		//no
		printTargetsumSubsets(arr,idx+1,asf,ssf,target);
	}

}
