package encapsulation;

public class EncapsulationMain {
	
	public static void main(String[] args) {
	
//		calling in intro class
		encapsulationIntro mn = new encapsulationIntro();
//		method not visible in the same packeage class because it is private
		mn.walk();
	}

}
