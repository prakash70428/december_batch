package lecture_6;
import java.util.*;

public class dem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        System.out.println(al);
        
        System.out.println(al.size());
        System.out.println(al.get(2));
        
        al.set(2,500);
        System.out.println(al);
        
        al.add(2,30);  //shifting
        System.out.println(al);
        
        al.remove(3);
        System.out.println(al);
	}

}
