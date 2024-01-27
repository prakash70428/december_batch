package lecture_5;

import java.util.Scanner;

public class wakanda_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0 ; i < n;i++) {
        	for(int j=0 ; j < n;j++) {
        		arr[i][j] = scn.nextInt();
        	}
        }
        
        wakanda(arr);
	}
	
	public static void wakanda(int[][] arr) {
		int n = arr.length;
		 for(int diag=0;diag < n;diag++) {
			 for(int i=0,j=diag ; j < n; i++,j++) {
				 System.out.print(arr[i][j] + " ");
			 }
	      }
	 }
	
//	int i = 0;
//	int j = diag;
//	
//	while(j < n) {
//		System.out.print(arr[i][j] + " ");
//		i++;
//		j++;
//	}

}
