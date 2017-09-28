package Question_and_his_son;

import org.apache.commons.lang3.ArrayUtils;

class MultiChoice extends Choice  {
	//多选题的标准答案
	int[] answers;
	//多选题的构造函数01
	MultiChoice() {}
	//多选题的构造函数02
	MultiChoice(String text,String[] options,int[] answers) {
		this.text=text;
		this.options=options;
		this.answers=answers;
	}
	//多选题的检查函数
	boolean check(int[] answers) {
		int n=this.answers.length;
		int nn=answers.length;
		if(n!=nn)return false;
		else {
			for(int i=0;i<n;i++)
			{
				boolean flag= ArrayUtils.contains(answers,this.answers[i]);
			    if(flag==false)return false;
			    		
			}
			return true;
		}
				
	}
	public void showAll() {
		
		System.out.print("*******************************");
		System.out.println("(多选题)"+this.getText());
		for(int j=0;j<options.length;j++) {
			System.out.println(options[j]);
		}
	}
		
	}
