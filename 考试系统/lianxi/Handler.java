package lianxi;

import java.util.Scanner;

public class Handler {

    public void docheck(Question[] questions,Answer[] myanswers) {
    	MultciChoiceCheck mc=new MultciChoiceCheck();
    	SingleChoiceCheck sc=new SingleChoiceCheck();
    	BlankCheck bc=new BlankCheck();
    	JudgeCheck jc=new JudgeCheck();
    	System.out.println("�������Ϊ��");
		for(int i=0;i<questions.length;i++) {
//			System.out.println((i+1)+"."+questions[i].check(myanswers[i]));
//			questions[i].check(myanswers[i]);
			if(questions[i]instanceof MultiChoice) 
			{mc.check(questions[i], myanswers[i]);}
			 else if(questions[i]instanceof SingleChoice){sc.check(questions[i], myanswers[i]);}
			 else if(questions[i]instanceof Finish_blank){bc.check(questions[i], myanswers[i]);}
			 else {jc.check(questions[i], myanswers[i]);}
			
			
		}
	}
	public void show(Question[] questions) {
//		System.out.println("**************************************");
//		System.out.println("");
		if (questions != null && questions.length > 0) {
			for(int i=0;i<questions.length;i++) {
				System.out.println("**************************************");
				System.out.print("��"+(i+1)+"."+"��");
				questions[i].showAll(questions[i]);
		}
		}
	}
	
	public void doAnswer(Question[] questions) {
//		a,b,d
//		"hh,jj,uu,ii".split(",");
		System.out.println("�ڴ�������Ĵ𰸣�");
		System.out.println("˵����ÿһ�������ö��š������ָ����ش�����Իس�����,��ʼ��һ��Ŀ����");
		String[][] myanswers=new String[500][];
		Scanner sc=new Scanner(System.in);
/////////////////////////////////////////////////////////////////////
		while(true) {
			int i=0; 
		    for(int j=0;;j++) {
		    
		    	if(i==questions.length)break;
////////////////myanswers[i][j]=sc.next();
		    	myanswers[0][0]=sc.next().toString();
		    	if(sc.next()==",") myanswers[i][j]=sc.next();
		    	else { i++;j=0;myanswers[i][j]=sc.next();}
		    }
		    
//		    if(i==questions.length)break;
		}
////////////////////////////////////////////////////////////////
	}
}
