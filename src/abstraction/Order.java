package abstraction;

public abstract class Order {
	
	int orderId;
	String customerName;
	
	void displayOrder() {
		System.out.println("Order " + orderId + " for " + customerName + " has been created.");
	}
	
	void cancleOrder( ) {
		System.out.println("Order " + orderId + " has been cancled.");
	}

}
