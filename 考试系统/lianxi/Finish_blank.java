package lianxi;

public  class Finish_blank extends Question {
  String[] answer;
  public Finish_blank() {}
  public Finish_blank(String title,String[] answer) {
	  super(title);
	  this.answer=answer;
  }
  public String[] getAnswer() {
	  return answer;
  }
//@Override
//public boolean check(String[] answer) {
//	boolean flag;
//	if(this.answer==answer) {
//		flag=true; 
//		System.out.println("√");
//		return true;
//		}
//	else {
//		flag=false; 
//		System.out.println("×");
//		return false;
//		}
//}
//public boolean check(Answer myanswer) {
//	boolean flag;
//	BlankAnswer answer=(BlankAnswer)myanswer;
//	//只有一个空的情况
//	if(this.answer.length==1) {
//		if(this.answer==answer.getAnswer()) {
//			System.out.println("√");
//			flag=true;
//			return true;
//			}
//		else {
//			System.out.println("×");
//			flag=false;
//			return false;
//			}
//	} 
//	//有多个空的情况
//	else {
//		if(this.answer.length!=answer.getAnswer().length) {
//			System.out.println("×");
//			flag=false;
//			return false;
//			}
//	
//		else {
//			for(int i=0;i<answer.getAnswer().length;i++) {
//				String[] temp=answer.getAnswer();
//				if(this.answer[i]!=temp[i]) {System.out.println("×");flag=false;return false;}
//			}
//			System.out.println("√");
//			flag=true;
//			return true;
//		}
//	}
//}

@Override
public void showAll(Question finish_blank) {
	System.out.println("(填空题)"+this.getTitle());
}
  
}
