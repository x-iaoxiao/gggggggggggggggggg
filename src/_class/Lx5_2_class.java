package _class;

public class Lx5_2_class {

	public int width;
	public int length;
	public Lx5_2_class() {}
	public Lx5_2_class(int width,int length) 
	{
		this.width=width;
		this.length=length;
	}
	public int getArea() //面积
	{
		int Area=this.width*this.length;
		
		return Area;
	}
	public int getPer()//周长
	{
		int Per=(this.length+this.width)*2;
		return Per;
	}
	public void showAll()//输出长 宽 高 面积 周长
	{
		System.out.println("长"+this.length);
		System.out.println("宽"+this.width);
		System.out.println("面积"+this.getArea());
		System.out.println("周长"+this.getPer());
		return ;
	}
	
}
