package lianxi;

public class Lx3_3 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
        //����ĳԱ���������н��30000Ԫ
		//��н����������Ϊ6%
		//�����Ա��10������н
		//��ͳ��δ��ʮ��������루�ӽ�������
		//
		double salary=30000;
		double money=0;
		for(int i=1;i<=10;i++)
		{
			money+=salary;
			salary=1.06*salary;
		}
		
		System.out.println("ʮ������нΪ"+salary);
		System.out.println("δ��ʮ���������Ϊ"+money);
		
	}

}
