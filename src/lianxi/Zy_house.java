package lianxi;

public class Zy_house {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//        0123456789ABCDEF
		//0     ******    
		//1   ******   *
		//2  ******     *
		//3 ******       *
		//4******         *
		//5****************
		//6*              *
//        7*		      *
		//8****************
		//i          1   2  3  4
		//j          3   2  1  0
		int i=0;
		
		for(i=0;i<5;i++)
		{
			for(int j=0;j<14;j++)
			{
				if( ( (j>i+3)&&(j<i+10) ) || ( (i>0)&&(j==4-i) )  )
				{System.out.print("*");}
				else {System.out.print("-");}
			}
			System.out.print("\n\r");	
		}
		
		for(i=5;i<9;i++) 
			{
				for(int j=0;j<14;j++) 
				{
					if(i==5||i==8||j==0||j==13)
						System.out.print("*");	
					else
						System.out.print("-");	
				}
				System.out.println("");	
			}
		
	}

}
