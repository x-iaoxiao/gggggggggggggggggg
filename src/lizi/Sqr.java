package lizi;

public class Sqr {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int i=0;
        for(;i<5;i++)
    {
        	System.out.print("\t");
    	for(int j=0;j<5;j++)
    	{
    		if(i==0||i==4||j==4||j==0)
    		{System.out.print("\t*");}
    		else {System.out.print("\t+");}
    	}
    	System.out.print("\n\r");
    }
	}

}
