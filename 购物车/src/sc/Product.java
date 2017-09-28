package sc;

public class Product {

	private String id;
	private String name;
	private double price;
	private String color;
	private String size;
	public Product() {}
	public Product(String id,String name,String color,String size,double price) {
		this.id=id;
		this.name=name;
		this.color=color;
		this.size=size;
		this.price=price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
//	@Override
//	public String toString() {
//		return "Product [name=" + name + ", color=" + color + ", size=" + size + "]";
//	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", color=" + color + ", size=" + size
				+ "]";
	}
	
}
