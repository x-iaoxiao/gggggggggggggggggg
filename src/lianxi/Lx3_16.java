package lianxi;

public class Lx3_16 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
//��дһ������ �ҳ�����200����С����
		int a=0;
		for(int i=200;;i++)
		{
			for(int j=2;j<i;j++) 
			{
				if(i%j==0||j==i)break;
				a=j;
			}
			if(a==i) {System.out.println(i);break;}
		}
	}

}
