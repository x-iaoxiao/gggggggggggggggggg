package lianxi;



public class Lx4_3 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
       //����һ����9��������1,6,2,3,9,4,5,7,8�������飬
		//������Ȼ����������������ֵ��
     int[] array= {1,6,2,3,9,4,5,7,8};
     int n=array.length;
     for(int i=1;i<n;i++)
     {
    	 for(int j=0;j<n-i;j++)
    	 {
    		 if(array[j]>array[j+1])
    		 {
    			 int temp=array[j];
    			 array[j]=array[j+1];
    			 array[j+1]=temp;
    		 }    	
    		 }
     }
     for(int j=0;j<n;j++)System.out.println(array[j]);
//     int[] array1=Arrays.sort;
	}

}
