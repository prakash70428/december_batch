package lecture_6;

public class string_interning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str = "hello";
        String str1 = "hello";
        String str2 = new String("hello");
        
        System.out.println(str == str2);
        
        System.out.println(str.equals(str2));
	}

}
