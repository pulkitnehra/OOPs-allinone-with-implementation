package inheritance;

public class multipleinheritance implements Car, Person{
	
	public static void main(String[] args) {
		multipleinheritance multiIn = new multipleinheritance();
		multiIn.speaks();
		multiIn.price();
	}

	@Override
	public void speaks() {
		// TODO Auto-generated method stub
		System.out.println("Speaks");
	}

	@Override
	public void price() {
		// TODO Auto-generated method stub
		System.out.println("Talks");
		
	}

}

interface Car{
	void price();
}

interface Person{
	void speaks();
}
