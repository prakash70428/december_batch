package lecture_7;
import java.util.*;
public class getstairspath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(getstairPath(n));
	}
	
	public static ArrayList<String> getstairPath(int n){
		 if(n == 0) {
			 ArrayList<String> bans = new ArrayList<>();
			 bans.add("");
			 return bans;
		 }
		 
		 if(n < 0) {
			 ArrayList<String> bans = new ArrayList<>();
			 return bans;
		 }
		 
		 ArrayList<String> rr1 = getstairPath(n-1);
		 ArrayList<String> rr2 = getstairPath(n-2);
		 ArrayList<String> rr3 = getstairPath(n-3);
		 
		 ArrayList<String> mr = new ArrayList<>();
		 for(int i=0 ;i < rr1.size();i++) {
			 mr.add("1" + rr1.get(i));
		 }
		 for(int i=0 ;i < rr2.size();i++) {
			 mr.add("2" + rr2.get(i));
		 }
		 for(int i=0 ;i < rr3.size();i++) {
			 mr.add("3" + rr3.get(i));
		 }
		 
		 return mr;	 
	}

}
