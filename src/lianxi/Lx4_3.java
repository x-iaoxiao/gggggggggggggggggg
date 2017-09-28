package lianxi;



public class Lx4_3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
       //给定一个有9个整数（1,6,2,3,9,4,5,7,8）的数组，
		//先排序，然后输出排序后的数组的值。
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
