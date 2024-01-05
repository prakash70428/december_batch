package lecture_3;

public class char_type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'a';
		char ch1 = 'b';
		
//		System.out.println(ch);
//		System.out.println(ch1);
//		
//		System.out.println((int)(ch));
//		System.out.println((int)(ch1)); // explicit
		
		//System.out.println((char)(ch + ch1)); explicit
		
		int x = 19;
		x++; // x = (int)(x+1); //implicit
		System.out.println(x);
		
		ch++; //ch = (char)(ch + 1); //implicit
		System.out.println(ch);
		
		ch = (char)(ch + 1); //explicit
		System.out.println(ch);
		
		ch += 1; //ch = (char)(ch + 1); //implicit
		System.out.println(ch);
	}

}
