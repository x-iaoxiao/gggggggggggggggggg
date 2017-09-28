package _class;


public class Lx5_5_Test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//5、定义两个类，描述如下： [必做题]
	//	5.1定义一个人类Person：
	//	5.1.1定义一个方法sayHello()，可以向对方发出问候语“hello,my name is XXX”
	//	5.1.2有三个属性：名字、身高、体重
	//	5.2定义一个PersonCreate类：
	//	5.2.1创建两个对象，分别是zhangsan，33岁，1.73；lishi，44，1.74
	//	5.2.2分别调用对象的sayHello()方法。
		
		
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
