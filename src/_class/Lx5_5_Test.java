package _class;


public class Lx5_5_Test {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
//5�����������࣬�������£� [������]
	//	5.1����һ������Person��
	//	5.1.1����һ������sayHello()��������Է������ʺ��hello,my name is XXX��
	//	5.1.2���������ԣ����֡���ߡ�����
	//	5.2����һ��PersonCreate�ࣺ
	//	5.2.1�����������󣬷ֱ���zhangsan��33�꣬1.73��lishi��44��1.74
	//	5.2.2�ֱ���ö����sayHello()������
		
		
		Lx5_5_class p1=new Lx5_5_class();
		Lx5_5_class p2=new Lx5_5_class();
		p1.setAge(10);
		p1.setHeigh(1.70);
		p1.setName("12345");
		Lx5_5_class2 p12=new Lx5_5_class2(p1);
//		Lx5_5_class2 p22=new Lx5_5_class2(p2);
        p12.getPerson().sayHello();

	}

}
