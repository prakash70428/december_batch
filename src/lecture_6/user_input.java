package lecture_6;
import java.util.*;
public class user_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
//		int n = Integer.parseInt(scn.nextLine());
//		String str = scn.nextLine();
//		
//		System.out.println(n);
//		System.out.println(str);
		
		
//		String str = scn.nextLine();     
//        System.out.println(str);
		
		String str = "NEWSPAPER";
		
		char ch = str.charAt(4);
		System.out.println("singleCharacter: "+ ch);
		
		int len = str.length();
		System.out.println("length: " + len);
		
		String s1 = str.substring(2,7);
		System.out.println("Substring: " + s1);
		
		String s2 = str.substring(3);
		System.out.println("Substring: " + s2);
		
		String str1 = str + "read";
		System.out.println(str1);
		
		System.out.println(str.substring(7,7));
		
		System.out.println(str.substring(5,2));
		
	}

}
