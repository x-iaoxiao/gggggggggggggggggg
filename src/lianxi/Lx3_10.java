package lianxi;

import java.util.Scanner;
public class Lx3_10 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
        //������������x y z
		//��������С�������
		System.out.println("��������������");
	    Scanner scx=new Scanner(System.in);
	    int x=scx.nextInt();
	    Scanner scy=new Scanner(System.in);
	    int y=scy.nextInt();Scanner sc=new Scanner(System.in);
	    Scanner scz=new Scanner(System.in);
	    int z=scz.nextInt();
	    int max=0;
	    int min=0;
	    int mid=0;
	    if(x>y) 
	    {
	    	if(z>x)
	    	{
	    		max=z;
	    		mid=x;
	    		min=y;
	    	}else if(z<y) {max=x;mid=y;min=z;}
	    	      else {max=x;mid=z;min=y;}
	   
	   	}else if(z<x) {max=y;mid=x;min=z;}
	     	 else if(z>y) {max=z;mid=y;min=x;} 
	    
	    
		System.out.println(min);
		System.out.println(mid);
		System.out.println(max);
		
		
	}

}
