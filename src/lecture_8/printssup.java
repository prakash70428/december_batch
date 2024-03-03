package lecture_8;
import java.util.*;
public class printssup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        
        Printss(str,"");
	}
	
	public static void Printss(String str,String asf) {
		if(str.length() == 0) {
			System.out.println(asf);
			return;
		}
		
		char ch = str.charAt(0);
		String ros = str.substring(1);
		
		//yes
		Printss(ros,asf + ch);
		//no
		Printss(ros,asf);
	}

}
