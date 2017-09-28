package sc;

public class Item {

	private Product product;
	private int amount;
//	private double price;
	private double total;
    public Item() {}
	public Item(Product product,int amount) {
		this.product=product;
		this.amount=amount;
//		this.price=price;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public double getTotal() {
    total=amount *product.getPrice();
		return total;
	}
	@Override
	public boolean equals(Object obj) {
		Item item1=this;
		Item item2=(Item)obj;
		if(item1.getProduct().getId().equals(item2.getProduct().getId()))
			return true;
		else return false;
	}
	@Override
	public String toString() {
		return "Item [product=" + product + ", amount=" + amount + "] total=" + this.getTotal();
	}
	
}
