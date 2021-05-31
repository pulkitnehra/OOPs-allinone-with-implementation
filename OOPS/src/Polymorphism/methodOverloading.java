public class methodOverloading{
	public static void main(String[] args) {
		Animal anm1 = new Animal();
		Animal anm2 = new Animal();

		anm1.name = "kangaroo";
		anm1.feet = 2;
		anm1.food = "grass";
		anm1.walk();
		anm1.walk(100);
	}
}


class Animal{
	String name;
	int feet;
	String food;
	int steps;
	void walk(){
		System.out.println(name+" walks on four feet");
	}

	void eat(){	
		System.out.println(name+" having "+feet+" feet eats "+food);
	}

// method overloading 
	void walk(int steps){
		System.out.println(name+" has walked "+steps+" steps");
	}
}




