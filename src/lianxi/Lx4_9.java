package lianxi;

public class Lx4_9 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
//����һά����{ -10��2��3��246��-100��0��5} ��
		//����������е�ƽ��ֵ�����ֵ����Сֵ��
       int[] a= {-10,2,3,246,-100,0,5};
       int average=a[0];
       int max=a[0];
       int min=a[0];
       int n=a.length;
       for(int i=1;i<n;i++) 
       {
    	   average+=a[i];
       }
       average/=n;  
       for(int j=1;j<n;j++) 
       {
    	   if(a[j]>max) {max=a[j];}
    	  
       }
       for(int j=1;j<n;j++) 
       {
    	   if(a[j]<min) {min=a[j];}
    	  
       }
       System.out.println("ƽ��ֵ"+average);
       System.out.println("��Сֵ"+min);
       System.out.println("���ֵ"+max);
       System.out.println(a[0]>a[5]);
	}

}
