package lianxi;

public class Zy_8_5_2 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
//��1-100���ۼ�ֵ ��Ҫ������λΪ3����
		int num=0;
		int i=1;
		for(;i<=100;)
		{
            int j=i%10;
            if(j==3) {i++;continue;}
            else {
            	num=num+i;
            	i++;}
		}
		System.out.println(num);
	}

}
