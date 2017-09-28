package lianxi;

public class Lx2_3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//3、华氏温度和摄氏温度互相转换，从华氏度变成摄氏度你只要减去32，乘以5再除以9就行了，
		//将摄氏度转成华氏度，直接乘以9，除以5，再加上32即行。[选做题]
      int h=192;
      int h_c=((h-32)*5)/9;
      int c=30;
      int c_h=c*9/5+32;
      System.out.println("华氏"+h+"转化为摄氏是"+h_c+"度");
      System.out.println("摄氏"+c+"转化为华氏是"+c_h+"度");
	}

}
