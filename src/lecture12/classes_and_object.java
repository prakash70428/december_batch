package lecture12;

public class classes_and_object {
	
	public static class Person{
		String name;
		int age;
		
		public void sayHi() {
			System.out.println(name + "@" + age + " Say Hi");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Person p1 = new Person();
        p1.name = "A";
        p1.age = 10;
        
        Person p2 = new Person();
        p2.name = "B";
        p2.age = 20;
        
        p1.sayHi();
        p2.sayHi();
        swap4(p1,p2);
        p1.sayHi();
        p2.sayHi();
	}
	public static void swap1(Person p1,Person p2) {
		Person temp = p1;
		p1 = p2;
		p2 = temp;
	}
	public static void swap2(Person p1,Person p2) {
		String t = p1.name;
		p1.name = p2.name;
		p2.name = t;
		
		int temp = p1.age;
		p1.age = p2.age;
		p2.age = temp;
	}
	public static void swap3(Person p1,Person p2) {
		String t = p1.name;
		p1.name = p2.name;
		p2.name = t;
		
		p1 = new Person();
		int temp = p1.age;
		p1.age = p2.age;
		p2.age = temp;
		
	}
	public static void swap4(Person p1,Person p2) {
		p1 = new Person();
		String t = p1.name;
		p1.name = p2.name;
		p2.name = t;
		
		p2 = new Person();
		int temp = p1.age;
		p1.age = p2.age;
		p2.age = temp;
		
		p1.sayHi();
	}

}
 