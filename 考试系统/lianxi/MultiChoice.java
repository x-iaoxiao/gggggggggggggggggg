package lianxi;



public class MultiChoice extends Choice {

	char[] answers;
	public MultiChoice() {}
	public MultiChoice(String title,String[] options,char[] answers) {
		super(title,options);
		this.answers=answers;
	}
	public char[] getAnswers() {
		return answers;
	}
	public void setAnswers(char[] answers) {
		this.answers = answers;
	}
//	@Override
//	public boolean check(Answer myanswers) {
//		int n=this.answers.length;
////		int nn=answers.length;
//		MultiChoiceAnswer answer=(MultiChoiceAnswer)myanswers;
//		int nn=answer.getAnswer().length;
//		if(n!=nn) {  System.out.println("¡Á"); return false;}
//		else {
//			for(int i=0;i<n;i++)
//			{
//				boolean flag= ArrayUtils.contains(answer.getAnswer(),this.answers[i]);
//			    if(flag==false) {  System.out.println("¡Á");return false;}
//			  		
//			}
//			System.out.println("¡Ì");
//			return true;
//		}
//	}
	@Override
	public void showAll(Question multi) {
		System.out.println("(µ¥Ñ¡Ìâ)"+this.getTitle());
		for(int i=0;i<this.getOptions().length;i++) {
		System.out.println(this.getOptions()[i]);
		}
	}
}
