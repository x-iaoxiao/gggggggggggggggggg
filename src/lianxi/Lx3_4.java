package lianxi;

public class Lx3_4 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
       //求猴子第一天摘了多少桃子x
		//当即吃了一半 又多吃了一个
		//第二天将剩下的一半吃了一半 又多吃了一个
		//第三天。。。
		//。。。
		//第十天只剩下一个
		int num=1;//第十天桃子的数目
		for(int i=1;i<10;i++)
		{
			num=(num+1)*2;
		}
		System.out.println("第一天猴子共摘了"+num+"个桃子");
	}

}
