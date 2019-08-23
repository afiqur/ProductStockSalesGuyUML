package ARP;

public class Stock {

	private int stockid;
	private int quantity;
	Product product;
	SalesGuy salesGuy;

	public Stock(int stockid, int quantity, Product product, SalesGuy salesGuy) {
		this.stockid = stockid;
		this.quantity = quantity;
		this.product = product;
		this.salesGuy = salesGuy;
	}

	public void display() {
		product.display();
		System.out.println("Stock Id: " + stockid + " Quantity: " + quantity);
		salesGuy.display();
	}

	public static void main(String[] args) {
		Product product = new Product(11, "Mountain Dew", 20.0, 200);
		SalesGuy salesGuy = new SalesGuy(01, "Hrithik", "Seller", "017777777777", "hrithik@mail.com");
		Stock stock = new Stock(101, 300, product, salesGuy);
		stock.display();
	}
}
