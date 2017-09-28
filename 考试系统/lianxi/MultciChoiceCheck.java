package lianxi;

import org.apache.commons.lang3.ArrayUtils;

public class MultciChoiceCheck implements Check {

	@Override
	public boolean check(Question question,Answer myanswers) {
	
		MultiChoice multi=(MultiChoice)question;
		int n=multi.getAnswers().length;
//		int nn=answers.length;
		MultiChoiceAnswer answer=(MultiChoiceAnswer)myanswers;
		int nn=answer.getAnswer().length;
		if(n!=nn) {  System.out.println("¡Á"); return false;}
		else {
			for(int i=0;i<n;i++)
			{
				boolean flag= ArrayUtils.contains(multi.getAnswers(),answer.getAnswer()[i]);
			    if(flag==false) {  System.out.println("¡Á");return false;}
			  		
			}
			System.out.println("¡Ì");
			return true;
		}
		
	}

}
