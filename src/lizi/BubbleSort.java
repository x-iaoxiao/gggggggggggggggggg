package lizi;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//冒泡排序 将n个数按从小到大的顺序进行排序
		//
		
		int[] array= {34,90,22,45,78,10,3};
		int n=array.length;
//		for(int i=1;i<n;i++)
//		{
//			for(int j=0;j<n-i;j++)
//			{
//				if(array[j] > array[j + 1]) 
//				{
//					int temp=array[j];
//					array[j]=array[j+1];
//					array[j+1]=temp;
//				}
//			}
//		}
//		for(int j=0;j<=n-1;j++)System.out.println(array[j]);
		for (int i = 1; i < n; i++) 
		{
	        for (int j = 0; j < n - i ; j++) 
	        {
		    if (array[j] > array[j + 1]) 
		      {
		           int t = array[j];
		           array[j] = array[j + 1];
		           array[j + 1] = t;
		      }
	        }
	    }
		for(int j=0;j<=n-1;j++)System.out.println(array[j]);
}

	}


