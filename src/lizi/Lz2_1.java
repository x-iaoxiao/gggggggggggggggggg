package lizi;

public class Lz2_1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		 int i=0;
		    int a = i++;
		    System.out.println(a + ", " + i);//0,1
		    a = ++i;
		    System.out.println(a + ", " + i);//2,2
		    i=i++;//
		    
		    System.out.println(i);//2
	}

}
