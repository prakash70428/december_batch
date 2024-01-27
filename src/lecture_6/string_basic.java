package lecture_6;

public class string_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str = "hello";
        String str1 = new String("hello");
        String str2 = "hello";
        String str3 = new String("hello");
        
        System.out.println(str);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        
        int a = 9;
        int b = 9;
        System.out.println(a == b);
        System.out.println(str == str1);
        System.out.println(str == str2);
        System.out.println(str1 == str3);
        System.out.println(str1 == str2);
        
        System.out.println(str1.equals(str2));
        
        str += 'e';
        System.out.println(str);
        
        
		
//		String s1 = "hey";
//		String s2 = "Bye";
//		s1 = s1 + s2;
//		String str1 = new String("hello");
//		String str2 = new String("bye");
//		str1 = str1 + str2;
//		s2 = s2 + "okay";
//		String s = "hey" + "bye";
	}

}
