package Question_and_his_son;

import org.apache.commons.lang3.ArrayUtils;

class MultiChoice extends Choice  {
	//��ѡ��ı�׼��
	int[] answers;
	//��ѡ��Ĺ��캯��01
	MultiChoice() {}
	//��ѡ��Ĺ��캯��02
	MultiChoice(String text,String[] options,int[] answers) {
		this.text=text;
		this.options=options;
		this.answers=answers;
	}
	//��ѡ��ļ�麯��
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
		System.out.println("(��ѡ��)"+this.getText());
		for(int j=0;j<options.length;j++) {
			System.out.println(options[j]);
		}
	}
		
	}
