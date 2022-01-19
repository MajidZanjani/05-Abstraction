package abstraction;

public class AbstractionExample {

	public static void main(String[] args) {

		Order oo1 = new OnlineOrder("Shop1");
		oo1.orderId = 1;
		oo1.customerName = "Majid";

		oo1.displayOrder(); // using abstract method
		
		oo1.cancleOrder(); // using abstract method
		
	}

}
