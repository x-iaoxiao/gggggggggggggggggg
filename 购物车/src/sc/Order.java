package sc;

public class Order {

	private Shopping_car car;
//	private Item[] items;
	private String order_id;
	private Customer order_customer;
	private Address address;
	private double total$;
	public Order(Shopping_car car,String order_id,Customer order_customer,double total$,String address) {
		this.car=car;
		this.order_id=order_id;
		this.order_customer=order_customer;
		this.total$=total$;
		this.address.setDefault_address(address);
	}
//	public Order(Item[] items,String order_id,Customer order_customer,double total$,String address) {
//		this.items=items;
//		this.order_id=order_id;
//		this.order_customer=order_customer;
//		this.total$=total$;
//		this.address.setDefault_address(address);
//	}
	public Shopping_car getItems() {
		return car;
	}
	public void setItems(Shopping_car car) {
		this.car = car;
	}
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	public Customer getOrder_customer() {
		return order_customer;
	}
	public void setOrder_customer(Customer order_customer) {
		this.order_customer = order_customer;
	}
	public double getTotal$(Item[] items) {
		int n=items.length;
		for(int i=0;i<n;i++) {
			total$+=items[i].getTotal();
		}
		return total$;
	}
	//ÓÐ´ýÍêÉÆ
	public void show() {
		System.out.println("************************************");
	}
}
