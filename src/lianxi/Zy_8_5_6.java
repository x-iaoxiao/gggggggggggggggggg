package lianxi;

public class Zy_8_5_6 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//百马百担
		//大马驮三担
		//中马2担
		//小马1担
		//大中小各几何？
		for(int i=0;i<34;i++)
		{
			for(int j=0;j<50;j++)
			{
				for(int k=0;k<=100;k++) 
				{
					if((i+k+j==100)&&(3*i+2*j+k/2==100)&&(k%2==0))
//						if(3*i+2*j+k/2==100)
							System.out.println("大马"+i+"中马"+j+"小马"+k);
				}
		     }
		}
	}

}
