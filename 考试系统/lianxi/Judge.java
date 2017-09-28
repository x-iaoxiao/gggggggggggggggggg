package lianxi;

public class Judge extends Question {
		  char answer;
		  public Judge() {}
		  public Judge(String title,char answer) {
			  super(title);
			  this.answer=answer;
		  }
	
public char getAnswer() {
	return answer;
}
//		  @Override
//	      public boolean check(Answer myanswer) {
////			  System.out.println("输入答案填空题答案 以空格分隔每一空");
//		  boolean flag;
//		  JudgeAnswer answer=(JudgeAnswer)myanswer;
//		  if(this.answer==answer.getAnswer()) {
//			  flag=true; 
//			  System.out.println("√");
//			  return true;
//			  }
//		  else {
//			  flag=false; 
//			  System.out.println("×");
//			  return false;}
//		}
@Override
public void showAll(Question judge) {
		System.out.println("(判断题)"+this.getTitle());
	}
	
}
