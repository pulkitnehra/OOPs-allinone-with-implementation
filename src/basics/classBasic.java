public class classBasic{
	public static void main(String[] args) {
		Animal anm = new Animal();
		anm.name = "Zebra";
		anm.feet = 4;

		Mammal mml = new Mammal();
		mml.name = "Platypus";

		System.out.println(anm.name+" has "+anm.feet+" feet");
	}
}

class Animal{
	String name;
	int feet;
}


class Mammal{
	String name;
	boolean givesEggs;
}