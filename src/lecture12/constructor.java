package lecture12;
import java.util.*;
public class constructor {

	public static class Person{
		String name;
		int age;
		
		//parametrized constructor
		public Person(String name,int age) {
			this.name = name;
			this.age = age;
		}
		//default constructor
		public Person() {
			
		}
		
		public void SayHi() {
			System.out.println(name + "@" + age + " Say Hi");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("A",10);
		p1.SayHi();
		
		Person p2 = new Person();
	}

}
