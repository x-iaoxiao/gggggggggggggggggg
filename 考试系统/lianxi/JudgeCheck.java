package lianxi;

public class JudgeCheck implements Check{

	@Override
	public boolean check(Question question, Answer myanswer) {
	
		Judge judge=(Judge)question;
		 boolean flag;
		  JudgeAnswer answer=(JudgeAnswer)myanswer;
		  if(judge.getAnswer()==answer.getAnswer()) {
			  flag=true; 
			  System.out.println("¡Ì");
			  return true;
			  }
		  else {
			  flag=false; 
			  System.out.println("¡Á");
			  return false;
			  }
		
	}
	
	

	
}
