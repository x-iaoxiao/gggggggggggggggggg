package lianxi;

public class MultiChoiceAnswer extends Answer{

	private char[] answer;
	public MultiChoiceAnswer(char... answer) {
		this.answer=answer;
	}
	public void setAnswer(char[] answer) {
		this.answer=answer;
	}
	public  char[] getAnswer() {
		return this.answer;
	}
}

