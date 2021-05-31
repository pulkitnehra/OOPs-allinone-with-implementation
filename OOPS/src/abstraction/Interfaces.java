package abstraction;
public class Interfaces implements Animal{
	
	public static void main(String[] args) {
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("interface done");
	}
	
}

//by default public abstract
interface Animal{
	void run();
}
