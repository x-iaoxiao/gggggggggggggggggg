package lianxi;

public class SingleChoiceCheck implements Check {

	@Override
	public boolean check(Question question, Answer myanswer) {
		boolean flag;
		SingleChoice single=(SingleChoice)question;
		SingleChoiceAnswer answer=(SingleChoiceAnswer)myanswer;
		if(single.getAnswer()==answer.getAnswer())
		{
			flag=true;
			System.out.println("¡Ì");
			return true;
		}
		else
			 {
			flag=false;
			System.out.println("¡Á");
	         return false;}
	}

}
