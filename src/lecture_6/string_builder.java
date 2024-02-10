package lecture_6;

public class string_builder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        StringBuilder sb = new StringBuilder("NEWSPAPER");
        
        System.out.println(sb);
        
        sb.append('s');
        System.out.println(sb);
        
        System.out.println(sb.charAt(2));
        sb.setCharAt(2, 'x');
        System.out.println(sb);
        sb.deleteCharAt(9);
        System.out.println(sb);
        
        sb.insert(2,'l'); //take care of shifting
        System.out.println(sb);
        
        System.out.println(sb.length());
        
        System.out.println(sb.toString());
	}

}
