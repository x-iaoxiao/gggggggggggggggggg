package lianxi;

public class Lx4_8 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
//��һ�������е��ظ�Ԫ�ر���һ�����������㡣��֪ʶ�㣺�������������Ԫ�ط��ʣ� [ѡ����
		
		int[] a= {0,1,3,5,3,4,6,2,8,6};
		
		int n=a.length;
		
		for(int i=0;i<n;i++)
			
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					n--;
					
					for(int k=j;k<n-1;k++) {a[k]=a[k+1];}
				}
			
			}
		}
		for(int j=0;j<n;j++)System.out.println(a[j]);
	}

}
