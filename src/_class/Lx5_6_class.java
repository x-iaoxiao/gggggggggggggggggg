package _class;

public class Lx5_6_class {

	String brand;
	String color;
	double speed;
	public Lx5_6_class() {}
	public Lx5_6_class(String brand,String color,double speed) {
		this.brand=brand;
		this.color=color;
		this.speed=speed;
	}
	public Lx5_6_class(String brand,String color) {
		this.brand=brand;
		this.color=color;
	}
	public String getBrand()
	{return this.brand;}
	public String getColor()
	{return this.color;}
	public double getSpeed()
	{return this.speed;}
	public void run() {
		System.out.println("speed:"+this.speed);
	}
	
	
}
