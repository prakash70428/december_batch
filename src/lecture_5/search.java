package lecture_5;

import java.util.Scanner;

public class search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0 ; i < n;i++) {
        	for(int j=0 ; j < m;j++) {
        		arr[i][j] = scn.nextInt();
        	}
        }
        
        int target = scn.nextInt();
        System.out.println(search(arr,target));
        
	}
	
	public static boolean search(int[][] arr,int tar) {
		int i = arr.length - 1;
		int j = 0;
		
		while(i >= 0 && j < arr[0].length) {
			if(arr[i][j] == tar) {
				return true;
			}
			else if(arr[i][j] > tar) {
				i--;
			}
			else {
				j++;
			}
		}
		
		return false;
	}

}
