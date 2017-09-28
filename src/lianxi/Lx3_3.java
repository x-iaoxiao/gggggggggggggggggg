package lianxi;

public class Lx3_3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
        //假设某员工今年的年薪是30000元
		//年薪的年增长率为6%
		//计算该员工10年后的年薪
		//并统计未来十年的总收入（从今年算起）
		//
		double salary=30000;
		double money=0;
		for(int i=1;i<=10;i++)
		{
			money+=salary;
			salary=1.06*salary;
		}
		
		System.out.println("十年后的年薪为"+salary);
		System.out.println("未来十年的总收入为"+money);
		
	}

}
