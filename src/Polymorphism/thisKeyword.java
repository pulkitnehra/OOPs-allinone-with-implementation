public class thisKeyword{
	public static void main(String[] args) {
		Person prsn1 = new Person(32, "Pulkit");
	}

}
class Person{
	int age;
	String name;

	public Person(){
		System.out.println("Default Constructor Called");
	}

	public Person(int age, String name){
		this();
		this.age = age;
		this.name = name;
		System.out.println("variables manipulated using this keyword are: "+age+","+name);	
	}
}