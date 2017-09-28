package lianxi;

public class Chicken {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
       //百鸡问题
		//母鸡三文一个题i
		//公鸡五文一个j
		//百钱百鸡 
		//各几何？
		//小鸡一文三个k
		for(int i=0;i<20;i++)
		{
			for(int j=0;j<34;j++)
			{
				for(int k=0;k<=100;k++)
				{
				if(i+j+k==100)
				{
					if((5*i+3*j+k/3==100)&&(k%3==0))
					
						System.out.println("公鸡："+i+"母鸡："+j+"小鸡："+k);
					
				}
				}
			}
		}
		
	}

}