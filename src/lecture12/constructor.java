package lecture12;
import java.util.*;
public class constructor {

	public static class Person{
		
		
		String name = "A";
		int age = 10;
		
		//parametrized constructor
//		public Person(String name,int age) {
//			this.name = name ;
//			this.age = age;
//		}
		
		
		
		public void SayHi() {
			System.out.println(name + "@" + age + " Say Hi");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		p1.SayHi();
		
		
//		p1.SayHi();
//		
//		Person p2 = new Person();
	}

}
