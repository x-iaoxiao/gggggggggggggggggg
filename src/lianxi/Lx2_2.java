package lianxi;

public class Lx2_2 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//2������һ��0��1000�����������λ���ĺͣ�����345�Ľ����3+4+5��12ע���ֽ����ּȿ����ȳ���ģҲ������ģ�����֪ʶ�㣺������������ۺ�Ӧ�ã� [������]
       int a=345;
       int a1=a%10;//5
       int a2=(a/10)%10;//4
       int a3=a/100;
       System.out.println("a=345,���ĸ�λ���ֱ�Ϊ��"+a3+","+a2+","+a1);
       System.out.println("��λ��֮��Ϊ��"+(a1+a2+a3));
	}

}
