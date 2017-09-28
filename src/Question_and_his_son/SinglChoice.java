package Question_and_his_son;

public class SinglChoice extends Choice {

	//单选题的标准答案
	int answer;
	//单选题的构造函数01
	SinglChoice() {}
	//单选题的构造函数02
	SinglChoice(String text,String[] options,int answer) {
		this.text=text;
		this.options=options;
		this.answer=answer;
	}
	//单选题的check函数
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
		System.out.println("(单选题)"+this.getText());
		for(int j=0;j<options.length;j++) {
			System.out.println(options[j]);
		}
		}
	}
