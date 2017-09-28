package lianxi;

public class Lx4_9 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//给定一维数组{ -10，2，3，246，-100，0，5} ，
		//计算出数组中的平均值、最大值、最小值。
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
       System.out.println("平均值"+average);
       System.out.println("最小值"+min);
       System.out.println("最大值"+max);
       System.out.println(a[0]>a[5]);
	}

}
