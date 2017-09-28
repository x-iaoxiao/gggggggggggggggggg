package lianxi;

public class SingleChoice extends Choice {

	protected char answer;
	public SingleChoice() {}
	public SingleChoice(String title,String[] options,char answer) {
		super(title,options);
		this.answer=answer;
	}
	public char getAnswer() {
		return answer;
	}
	public void setAnswer(char answer) {
		this.answer = answer;
	}
//	@Override
//	public boolean check(Answer myanswer) {
//		boolean flag;
//		SingleChoiceAnswer answer=(SingleChoiceAnswer)myanswer;
//		if(this.answer==answer.getAnswer())
//		{
//			flag=true;
//			System.out.println("°Ã");
//			return true;
//		}
//		else
//			 {
//			flag=false;
//			System.out.println("°¡");
//	         return false;}
//	    
//	}

	@Override
	public void showAll(Question Multi) {
		
		System.out.println("(µ•—°Ã‚)"+this.getTitle());
		for(int i=0;i<this.getOptions().length;i++) {
		System.out.println(this.getOptions()[i]);
		}
	}
	
}
