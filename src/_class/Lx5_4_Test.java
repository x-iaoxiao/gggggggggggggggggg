package _class;

//import _class.Lx5_4_class;
public class Lx5_4_Test {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
        //���һ����Student��
		//�������������ѧ�źͳɼ���
		//���һ�����������ճɼ��Ӹߵ��͵�˳�����������ѧ�źͳɼ���Ϣ��[ѡ����
		Lx5_4_class stu1=new Lx5_4_class('��',146201,80) ;
		Lx5_4_class stu2=new Lx5_4_class('Ǯ',146202,90) ;
		Lx5_4_class stu3=new Lx5_4_class('��',146203,70) ;
		Lx5_4_class stu4=new Lx5_4_class('��',146204,60) ;
		Lx5_4_class stu5=new Lx5_4_class('��',146205,95) ;
		Lx5_4_class[] student= {stu1,stu2,stu3,stu4,stu5};
		int n=student.length;
		for(int i=1;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				if(student[j].score<student[j+1].score) {
					int temp=student[j].score;
					student[j].score=student[j+1].score;
					student[j+1].score=temp;
				}
				
			}
		}
		
		for(int j=0;j<n;j++)	{
			student[j].print();
		}
		
	}

    
}
