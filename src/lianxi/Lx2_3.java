package lianxi;

public class Lx2_3 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
//3�������¶Ⱥ������¶Ȼ���ת�����ӻ��϶ȱ�����϶���ֻҪ��ȥ32������5�ٳ���9�����ˣ�
		//�����϶�ת�ɻ��϶ȣ�ֱ�ӳ���9������5���ټ���32���С�[ѡ����]
      int h=192;
      int h_c=((h-32)*5)/9;
      int c=30;
      int c_h=c*9/5+32;
      System.out.println("����"+h+"ת��Ϊ������"+h_c+"��");
      System.out.println("����"+c+"ת��Ϊ������"+c_h+"��");
	}

}
