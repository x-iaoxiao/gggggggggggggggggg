package Question_and_his_son;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		String singlechoice_text="1.判断下列那个是对的：";
		String multilechoice_text="2.判断下列那个是错的：";
		String[] _options= {"1.人是猪","2.人是狗","3.人不是猪也不是狗"};
		int answer=3;
		int[] answers= {1,2};
		SinglChoice singlechoice1=new SinglChoice(singlechoice_text,_options,answer) ;
		MultiChoice multiechoice1=new MultiChoice(multilechoice_text,_options,answers);
		Question[] questions= {singlechoice1,multiechoice1};
		singlechoice1.showAll();
		Scanner sc1=new Scanner(System.in);
		int myanswer=sc1.nextInt();
		singlechoice1.check(myanswer);
		multiechoice1.showAll();
		Scanner sc2=new Scanner(System.in);
    	int myanswers=sc2.nextInt();
		singlechoice1.check(myanswers);
//		Question[] ques= {singlechoice1,multiechoice1};
		
	}

}
