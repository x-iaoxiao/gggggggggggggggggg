package Question_and_his_son;

public class SinglChoice extends Choice {

	//��ѡ��ı�׼��
	int answer;
	//��ѡ��Ĺ��캯��01
	SinglChoice() {}
	//��ѡ��Ĺ��캯��02
	SinglChoice(String text,String[] options,int answer) {
		this.text=text;
		this.options=options;
		this.answer=answer;
	}
	//��ѡ���check����
	boolean check(int answer) {
		if(this.answer==answer)
		{
			System.out.println("true");
			return true;
		}
		else
			 {
			System.out.println("false");
	         return false;}
	    
	}	
	public void showAll() {

		System.out.println("*******************************");
		System.out.println("(��ѡ��)"+this.getText());
		for(int j=0;j<options.length;j++) {
			System.out.println(options[j]);
		}
		}
	}
