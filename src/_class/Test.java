package _class;

import _class.Point;

public class Test {
	public static void main(String[] args) {
	//����һ������Point��
	//����2����Ա����x��y�ֱ��ʾx��y���꣬
	//2��������Point()��Point(int x0,y0),
	//�Լ�һ��movePoint��int dx,int dy������ʵ�ֵ��λ���ƶ���
	//��������Point����p1��p2��
	//�ֱ����movePoint�����󣬴�ӡp1��p2�����ꡣ[������]
	Point p1=new Point();
	Point p2=new Point(3,2);
    p1.movePoint(5, 5);
    p2.movePoint(5, 5);
    System.out.println("�ƶ���p1������Ϊ��x="+p1.x+",y="+p1.y);
    System.out.println("�ƶ���p2������Ϊ��x="+p2.x+",y="+p2.y);
}
}
