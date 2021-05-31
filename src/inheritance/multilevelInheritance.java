public class multilevelInheritance{
	public static void main(String[] args) {
		Bunny bn = new Bunny("BugsBunny",5,"White");
		// inheriting methods of both parent classes
		bn.walk();
		bn.eat();
	}
}

class Animal{
	String name;
	int feet;
	String color;

	Animal(String name, int feet, String color){
		this.name = name;
		this.feet = feet;
		this.color = color;
		System.out.println(name+" has "+feet+" feet & is "+color+" in color");
	}

	void walk(){
		System.out.println("Parent class method");
	}
}

class Zebra extends Animal{
	public Zebra(String name, int feet, String color){
	//Accessing parent class properties using super keyword 
	super(name, feet, color);
	// accesing parent class methods using super
	super.walk();
	}

	// method overriding
	// using the same parent function to perfromr a different task
	void walk(){
		System.out.println(name+" has modified the parent method");
	}

	void eat(){
		System.out.println("Zebra eats grass");
	}
}

class Bunny extends Zebra{

		Bunny(String name, int feet, String color){
			super(name, feet, color);
		}


	} 
