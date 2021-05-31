public class simpleInheritance{
	public static void main(String[] args) {
		Zebra z1 = new Zebra("Zebra",4,"black");
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

}
