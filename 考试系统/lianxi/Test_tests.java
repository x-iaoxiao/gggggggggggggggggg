package lianxi;

public class Test_tests {
	
	public static void main (String[] args) {
	
	//******************************�������**************************
	
//������ѡ��Ͷ�ѡ��//////////////////////
	//ѡ�������ɺ�ѡ��
	String q1_singlechoice_title="�����ĸ�����ȷ�ģ�";
	String q2_singlechoice_title="�����Ǹ��Ǵ���ģ�";
	String[] q1_and_q2_optipns= {"1.������","2.���ǹ�","3.�˲�����Ҳ���ǹ�"};
	//ѡ����ı�׼��
	char q1_answer= '3';
	char[] q2_answer= {'1','2'};
	//�½���ѡ����ѡ
	Question q1_singlechoice=new SingleChoice(q1_singlechoice_title,q1_and_q2_optipns,q1_answer);
	Question q2_multichoice=new MultiChoice(q2_singlechoice_title,q1_and_q2_optipns,q2_answer);
///////////////////ѡ���ⲿ�ִ������/////////
	
	
///////////////////////////////��������⣬һ����һ�գ�һ���ж����	
	//ѡ�������ɲ���
	String q3_finish_blank_title="���������____";
	String q4_finish_blank_title="����Ա���____������____";
	//�����ı�׼��
	String[] q3_answer= {"С�ɰ�"};
    String[] q4_answer= {"Ů","16"};
	//�½����
	Question q3_finish_blank_01=new Finish_blank(q3_finish_blank_title,q3_answer);
	Question q4_finish_blank_02=new Finish_blank(q4_finish_blank_title,q4_answer);
/////////////////////////////����ⲿ�ֹ������//////////////////////
	
	
/////////////////�����ж���///////////////////
	//�ж������ɲ���
	String q5_judge_title="¹����˧";
	//�ж���ı�׼��
	char q5_answer= '��';
	//�½��ж���
	Question q5_judge=new Judge(q5_judge_title,q5_answer);
	
	
	
	///////////////////////���⼯/////////////////////////////
	Question[] questions= {q1_singlechoice,q2_multichoice,q3_finish_blank_01,q4_finish_blank_02,q5_judge};
	
//////////�ж��ⲿ�ִ������///////////////////
	
	
	
//********************��ⴴ�����***********************************	
	

	
	
	
	
//***********************ģ��myanswers******************************
	SingleChoiceAnswer p1_myanswer= new SingleChoiceAnswer('3');
	MultiChoiceAnswer p2_myanswer=new MultiChoiceAnswer('1','2');
	BlankAnswer p3_myanswer= new BlankAnswer("С�ɰ�");
	BlankAnswer p4_myanswer= new BlankAnswer("Ů","16");
	JudgeAnswer p5_myanswer=new JudgeAnswer('��');
	Answer[] myanswers= {p1_myanswer,p2_myanswer,p3_myanswer,p4_myanswer,p5_myanswer};

	

	//***********************ģ��myanswers******************************
//	int n=questions.length;
//	Answer[] myanswers= new Answer[100];
	Handler handler=new Handler();

	//��ʾ������Ŀ
	
	handler.show(questions);
	
	
	//�Ӽ��̽���myanswers
	
	
//	handler.doAnswer(questions);

	//����
	
	handler.docheck(questions,myanswers);
	
	
	
	}	
	
}
