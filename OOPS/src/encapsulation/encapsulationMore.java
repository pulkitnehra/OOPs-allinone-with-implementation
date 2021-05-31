package encapsulation;

public class encapsulationMore {
	
	public static void main(String[] args) {
		LaptopPrice lp = new LaptopPrice();
		lp.setPrice(0, true);
	}

}

class LaptopPrice{
//	user should be able to set the price so easily
	private int price;
	String name;
	private boolean isAdmin;
	
//	to make only authorized user access the data and hiding the internal details of the user we use getter setter
//	so that the internal details are not modified
	public void setPrice(int price, boolean isAdmin) {
		
//		check if it is properly authenticated
		this.isAdmin = isAdmin;
//		check for price
		if(!isAdmin) {
			System.out.println("You're not authorized to edit the price!");
		}else {
			this.price = price;
		}
		
		
	}
	
	
	
}