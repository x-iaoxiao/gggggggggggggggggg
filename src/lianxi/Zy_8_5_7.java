package lianxi;

public class Zy_8_5_7 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
//whileѭ��100�ڷֱ��������ż���ĺ�
		int i=1;
		int sum1=0;
		int sum2=0;
		while(i<=100)
		{
			if(i%2!=0) {sum1=sum1+i;i++;}
			else {sum2=sum2+i;i++;}
		}
		System.out.println("100��������������Ϊ��"+sum1);
		System.out.println("100��������ż����Ϊ��"+sum2);
		
		
		
	}

}
