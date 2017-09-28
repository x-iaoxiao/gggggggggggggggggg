package _class;

import _class.Point;

public class Test {
	public static void main(String[] args) {
	//定义一个点类Point，
	//包含2个成员变量x、y分别表示x和y坐标，
	//2个构造器Point()和Point(int x0,y0),
	//以及一个movePoint（int dx,int dy）方法实现点的位置移动，
	//创建两个Point对象p1、p2，
	//分别调用movePoint方法后，打印p1和p2的坐标。[必作题]
	Point p1=new Point();
	Point p2=new Point(3,2);
    p1.movePoint(5, 5);
    p2.movePoint(5, 5);
    System.out.println("移动后p1的坐标为：x="+p1.x+",y="+p1.y);
    System.out.println("移动后p2的坐标为：x="+p2.x+",y="+p2.y);
}
}
