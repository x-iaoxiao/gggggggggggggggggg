package _class;

//import _class.Lx5_4_class;
public class Lx5_4_Test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
        //设计一个类Student，
		//该类包括姓名、学号和成绩。
		//设计一个方法，按照成绩从高到低的顺序输出姓名、学号和成绩信息。[选做题
		Lx5_4_class stu1=new Lx5_4_class('赵',146201,80) ;
		Lx5_4_class stu2=new Lx5_4_class('钱',146202,90) ;
		Lx5_4_class stu3=new Lx5_4_class('孙',146203,70) ;
		Lx5_4_class stu4=new Lx5_4_class('李',146204,60) ;
		Lx5_4_class stu5=new Lx5_4_class('周',146205,95) ;
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
