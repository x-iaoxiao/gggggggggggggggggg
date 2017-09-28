package _class;

public class Lx_5_6_Test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//7、定义一个汽车类Vehicle，要求如下：[选做题]
	//	7.1属性包括：汽车品牌brand（String类型）、颜色color（String类型）和速度speed（double类型），并且所有属性为私有。
    //7.2至少提供一个有参的构造方法（要求品牌和颜色可以初始化为任意值，但速度的初始值必须为0）。
    //7.3为私有属性提供访问器方法。注意：汽车品牌一旦初始化之后不能修改。
	//7.4定义一个一般方法run()，用打印语句描述汽车奔跑的功能
	//7.5定义测试类VehicleTest，在其main方法中创建一个品牌为“benz”、颜色为“black”的汽车。
  
		Lx5_6_class vehicle=new Lx5_6_class("benz","black");
		vehicle.run();
	}

}
