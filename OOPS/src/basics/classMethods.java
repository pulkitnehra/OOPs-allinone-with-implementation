public class classMethods{
	public static void main(String[] args) {
		Animal anm1 = new Animal();
		Animal anm2 = new Animal();

		anm1.name = "kangaroo";
		anm1.feet = 2;
		anm1.food = "grass";
		anm1.walk();
		anm1.eat();

		anm2.name = "Zebra";
		anm2.feet = 4;
		anm2.food = "grass";
		anm2.walk();
		anm2.eat();

	}
}


class Animal{
	String name;
	int feet;
	String food;
	void walk(){
		System.out.println(name+" walks on four feet");
	}

	void eat(){	
		System.out.println(name+" having "+feet+" feet eats "+food);
	}
}




