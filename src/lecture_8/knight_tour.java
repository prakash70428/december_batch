package lecture_8;
import java.util.*;
public class knight_tour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r = scn.nextInt();
        int c = scn.nextInt();
       
        printKnightTour(new int[n][n],r,c,1);
	}
	
	public static void printKnightTour(int[][] chess,int r,int c,int stepno) {
		if(r < 0 || r >= chess.length || c < 0 || c >= chess.length || chess[r][c] > 0) {
			return;
		}
		
		if(stepno == chess.length*chess.length) {
			chess[r][c] = stepno;
			display(chess);
			chess[r][c] = 0;
			return;
		}
		
		chess[r][c] = stepno;
		printKnightTour(chess,r-2,c+1,stepno+1);
		printKnightTour(chess,r-1,c+2,stepno+1);
		printKnightTour(chess,r+1,c+2,stepno+1);
		printKnightTour(chess,r+2,c+1,stepno+1);
		printKnightTour(chess,r+2,c-1,stepno+1);
		printKnightTour(chess,r+1,c-2,stepno+1);
		printKnightTour(chess,r-1,c-2,stepno+1);
		printKnightTour(chess,r-2,c-1,stepno+1);
		chess[r][c] = 0;
	}
	
	public static void display(int[][] chess) {
		for(int i=0 ;i < chess.length;i++) {
			for(int j=0 ; j < chess.length;j++) {
				System.out.print(chess[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

}
