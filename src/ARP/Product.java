package ARP;

public class Product {
	private int prodid;
	private String name;
	private double unitPrice;
	private int quantity;

	public Product(int prodid, String name, double unitPrice, int quantity) {
		this.prodid = prodid;
		this.name = name;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
	}

	public void display() {
		System.out.println("Product Id: " + prodid + " Product Name: " + name + " Unit Price: " + unitPrice
				+ " Quantity: " + quantity);
	}
}
