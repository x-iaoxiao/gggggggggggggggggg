package lianxi;

public class Lx4_6 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
// ��һ����8��������18��25��7��36��13��2��89��63����������
		//�ҳ����������������±ꡣ
		//��֪ʶ�㣺�������������Ԫ�ط��ʣ� [������]
		int[] a= {18,25,7,36,13,2,89,63};
		int max=a[0];
		int n=a.length;
		int j=0;
		for(int i=1;i<n;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
				j=i;
			}
		}
		System.out.println("�����Ϊ��"+max+"���±�"+j);
	}

}
