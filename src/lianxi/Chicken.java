package lianxi;

public class Chicken {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
       //�ټ�����
		//ĸ������һ����i
		//��������һ��j
		//��Ǯ�ټ� 
		//�����Σ�
		//С��һ������k
		for(int i=0;i<20;i++)
		{
			for(int j=0;j<34;j++)
			{
				for(int k=0;k<=100;k++)
				{
				if(i+j+k==100)
				{
					if((5*i+3*j+k/3==100)&&(k%3==0))
					
						System.out.println("������"+i+"ĸ����"+j+"С����"+k);
					
				}
				}
			}
		}
		
	}

}