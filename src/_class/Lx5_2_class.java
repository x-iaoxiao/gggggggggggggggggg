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
	public int getArea() //���
	{
		int Area=this.width*this.length;
		
		return Area;
	}
	public int getPer()//�ܳ�
	{
		int Per=(this.length+this.width)*2;
		return Per;
	}
	public void showAll()//����� �� �� ��� �ܳ�
	{
		System.out.println("��"+this.length);
		System.out.println("��"+this.width);
		System.out.println("���"+this.getArea());
		System.out.println("�ܳ�"+this.getPer());
		return ;
	}
	
}
