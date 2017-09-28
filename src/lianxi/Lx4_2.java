package lianxi;

public class Lx4_2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//将一个字符数组的值（neusofteducation）拷贝到另一个字符数组中。
		//（知识点：数组复制） [必做题]
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
