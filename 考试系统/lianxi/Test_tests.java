package lianxi;

public class Test_tests {
	
	public static void main (String[] args) {
	
	//******************************题库输入**************************
	
//创建单选题和多选题//////////////////////
	//选择题的题干和选项
	String q1_singlechoice_title="下列哪个是正确的？";
	String q2_singlechoice_title="下列那个是错误的？";
	String[] q1_and_q2_optipns= {"1.人是猪","2.人是狗","3.人不是猪也不是狗"};
	//选择题的标准答案
	char q1_answer= '3';
	char[] q2_answer= {'1','2'};
	//新建单选，多选
	Question q1_singlechoice=new SingleChoice(q1_singlechoice_title,q1_and_q2_optipns,q1_answer);
	Question q2_multichoice=new MultiChoice(q2_singlechoice_title,q1_and_q2_optipns,q2_answer);
///////////////////选择题部分创建完毕/////////
	
	
///////////////////////////////创建填空题，一个有一空，一个有多个空	
	//选择题的题干部分
	String q3_finish_blank_title="你的名字是____";
	String q4_finish_blank_title="你的性别是____年龄是____";
	//填空题的标准答案
	String[] q3_answer= {"小可爱"};
    String[] q4_answer= {"女","16"};
	//新建填空
	Question q3_finish_blank_01=new Finish_blank(q3_finish_blank_title,q3_answer);
	Question q4_finish_blank_02=new Finish_blank(q4_finish_blank_title,q4_answer);
/////////////////////////////填空题部分构造完毕//////////////////////
	
	
/////////////////创建判断题///////////////////
	//判断题的题干部分
	String q5_judge_title="鹿晗最帅";
	//判断题的标准答案
	char q5_answer= '√';
	//新建判断题
	Question q5_judge=new Judge(q5_judge_title,q5_answer);
	
	
	
	///////////////////////问题集/////////////////////////////
	Question[] questions= {q1_singlechoice,q2_multichoice,q3_finish_blank_01,q4_finish_blank_02,q5_judge};
	
//////////判断题部分创建完成///////////////////
	
	
	
//********************题库创建完成***********************************	
	

	
	
	
	
//***********************模拟myanswers******************************
	SingleChoiceAnswer p1_myanswer= new SingleChoiceAnswer('3');
	MultiChoiceAnswer p2_myanswer=new MultiChoiceAnswer('1','2');
	BlankAnswer p3_myanswer= new BlankAnswer("小可爱");
	BlankAnswer p4_myanswer= new BlankAnswer("女","16");
	JudgeAnswer p5_myanswer=new JudgeAnswer('√');
	Answer[] myanswers= {p1_myanswer,p2_myanswer,p3_myanswer,p4_myanswer,p5_myanswer};

	

	//***********************模拟myanswers******************************
//	int n=questions.length;
//	Answer[] myanswers= new Answer[100];
	Handler handler=new Handler();

	//显示所有题目
	
	handler.show(questions);
	
	
	//从键盘接收myanswers
	
	
//	handler.doAnswer(questions);

	//检查答案
	
	handler.docheck(questions,myanswers);
	
	
	
	}	
	
}
