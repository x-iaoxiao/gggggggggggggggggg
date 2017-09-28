package lianxi;

public class Test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//百鸡问题
				//母鸡三文一个题
				//公鸡五文一个
				//百钱百鸡 
				//各几何？
				//小鸡一文三个
//				int girl=0;//母鸡的数量
//				int boy=0;//公鸡的数量
//				int child=100-boy-girl;//小鸡的数量
//				for(;boy<=20;boy++)
//				{
//					for(;girl<=33;girl++)
//					{
//						if(child%3==0&&boy+girl+child==100&&5*boy+3*girl+child/3==100)
//						{
//						System.out.println("公鸡："+boy+"\t母鸡："+girl+"\t小鸡："+child);
//						}
//						else continue;
//					}
//				}
				
//		System.out.println("公鸡：\t母鸡：\t小鸡：");
		int girl=0;//母鸡的数量
    	int boy=0;//公鸡的数量
		int child=100-boy-girl;//小鸡的数量
		for(;boy<=20;boy++)
		{
			for(;girl<=33;girl++)
			{
				child=100-boy-girl;
				System.out.println("公鸡："+boy+"\t母鸡："+girl+"\t小鸡："+child);
			}
		}
		System.out.println("公鸡：\t母鸡：\t小鸡：");
	}

}
