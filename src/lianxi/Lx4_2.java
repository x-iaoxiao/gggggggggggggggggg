package lianxi;

public class Lx4_2 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
//��һ���ַ������ֵ��neusofteducation����������һ���ַ������С�
		//��֪ʶ�㣺���鸴�ƣ� [������]
		int[] array1= {1,5,7,4,57,2};
		int[] array2= new int[10];
        int n=array1.length;
        for(int i=0;i<n;i++)
        {
        	array2[i]=array1[i];
            System.out.println("array1["+i+"]:"+array1[i]+",array2["+i+"]:"+array2[i]);	
        }
	}

}
