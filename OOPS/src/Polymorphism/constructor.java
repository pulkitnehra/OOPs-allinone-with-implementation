// programs demonstrasting constructor usage

public class constructor{
	public static void main(String[] args) {
		// calling static methods
		constructor.SubNumbers.hello();
		constructor.hello2();
		// calling normal methods
		AddNumbers addnum1 = new AddNumbers();
		AddNumbers addnum2 = new AddNumbers(5,8);
		// method of static class can only be called using this

	}


// static block are always loaded/executed first in the class during loading
	static{
		System.out.println("Static block executed");
	}
	
	static void hello2(){
		System.out.println("Static method of main class  called....");
	}

// Inner static class
	static class SubNumbers{
	int num1;
	int num2;
	static void hello(){
		System.out.println("Static method called....");
	}
  }
}

class AddNumbers{
	int num1;
	int num2;
	static int count;
// constructor overloading
	AddNumbers(){
		count ++;
		System.out.println("Default Constructor for AddNumbers class");
	}

	AddNumbers(int num1, int num2){
		System.out.println("Incrementing by 1 .....");
		num1++;
		num2++;
		System.out.println("Addition of "+num1+" & "+num2+" is "+(num1 + num2));
	}
}



