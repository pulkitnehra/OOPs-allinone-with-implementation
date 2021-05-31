package abstraction;

public class Abstraction {
	
	public static void main(String[] args) {
		Hyundai hi1 = new Hyundai();
		Alto hi2 = new Alto();
		
		hi1.start();
		hi2.start();
		
	}	
}
class Hyundai extends Car
{
	void start() {
		System.out.println("Hyundai is starting");
	}
}

class Alto{
	void start() {
		System.out.println("Alto is starting");
	}
	
}

abstract class Car{
	int price;
	abstract void start();
	
}
