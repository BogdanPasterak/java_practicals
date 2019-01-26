package practical_2;

public class StockItem {

	// fields
	private String itemName;
	private int itemID;
	private int quantityInStock;
	private double price;
	
	// constructor	
	public StockItem(String nameIn, int idIn, int qISIn, double priceIn) {
		setItemName(nameIn);
		setItemID(idIn);
		quantityInStock = qISIn;
		price = priceIn;
	}
	
	// methods
	public int getQuantityInStock() {
		return quantityInStock;
	}
	
	public void addStock(int quantityToAdd) {
		if (quantityToAdd > 0)
			quantityInStock += quantityToAdd;
		else
			System.out.println("Enter a valid quantity");
	}
	
	public void removeStock(int quantityToRemove) {
		if (quantityToRemove > 0 && quantityToRemove <= quantityInStock )
			quantityInStock -= quantityToRemove;
		else
			System.out.println("Enter a valid quantity");
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double newPrice) {
		if (newPrice > 0)
			price = newPrice;
		else
			System.out.println("Enter a valid price amount");
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getItemID() {
		return itemID;
	}

	public void setItemID(int itemID) {
		this.itemID = itemID;
	}
	

}
