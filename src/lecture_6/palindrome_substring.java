package lecture_6;
import java.util.*;
public class palindrome_substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        
        substring(str);
	}
	public static void substring(String str) {
		for(int si=0 ; si < str.length();si++) {
			for(int ei = si ; ei < str.length();ei++) {
			   if(isPalindrome(str.substring(si , ei + 1)) == true) {
				   System.out.println(str.substring(si , ei + 1)); 
			   }	
			}
		}
	}
	public static boolean isPalindrome(String str) {
		int left = 0;
		int right = str.length() - 1;
		
		while(left < right) {
			if(str.charAt(left) != str.charAt(right)) {
				return false;
			}
			
			left++;
			right--;
		}
		
		return true;
	}

}
