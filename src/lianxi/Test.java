package lianxi;

public class Test {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//�ټ�����
				//ĸ������һ����
				//��������һ��
				//��Ǯ�ټ� 
				//�����Σ�
				//С��һ������
//				int girl=0;//ĸ��������
//				int boy=0;//����������
//				int child=100-boy-girl;//С��������
//				for(;boy<=20;boy++)
//				{
//					for(;girl<=33;girl++)
//					{
//						if(child%3==0&&boy+girl+child==100&&5*boy+3*girl+child/3==100)
//						{
//						System.out.println("������"+boy+"\tĸ����"+girl+"\tС����"+child);
//						}
//						else continue;
//					}
//				}
				
//		System.out.println("������\tĸ����\tС����");
		int girl=0;//ĸ��������
    	int boy=0;//����������
		int child=100-boy-girl;//С��������
		for(;boy<=20;boy++)
		{
			for(;girl<=33;girl++)
			{
				child=100-boy-girl;
				System.out.println("������"+boy+"\tĸ����"+girl+"\tС����"+child);
			}
		}
		System.out.println("������\tĸ����\tС����");
	}

}
