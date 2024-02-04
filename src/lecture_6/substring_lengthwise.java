package lecture_6;
import java.util.*;
public class substring_lengthwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str = "83415";
        Printsubstringlengthwise(str);
	}
	
	public static void Printsubstringlengthwise(String str) {
		for(int len=1; len <= str.length();len++) {
			for(int j=len; j <= str.length();j++) {
				int i = j - len;
				System.out.println(str.substring(i , j));
			}
		}
	}
	
}
