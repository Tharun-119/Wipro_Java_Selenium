package prog3;
public SaleItem(String productName, double price, int quantity) {
    this.productName = productName;
    this.price = price;
    this.quantity = quantity;
}

public double getTotalPrice() {
    return price * quantity;
}

public void displayItem() {
    System.out.println(productName + "\t" + price + "\t" + quantity + "\t" + getTotalPrice());
}
}

public class SaleSystemOops {
	public static void main(String[] args) {
	       SaleItem[] items = {
	           new SaleItem("Laptop", 50000, 1),
	           new SaleItem("Mouse", 500, 2),
	           new SaleItem("Keyboard", 1000, 1)
	       };
	       double grandTotal = 0;
	       System.out.println("Product\tPrice\tQty\tTotal");
	       System.out.println("--------------------------------------");
	       for (SaleItem item : items) {
	           item.displayItem();
	           grandTotal += item.getTotalPrice();
	       }
	       System.out.println("--------------------------------------");
	       System.out.println("Grand Total: " + grandTotal);
	   }
	}

