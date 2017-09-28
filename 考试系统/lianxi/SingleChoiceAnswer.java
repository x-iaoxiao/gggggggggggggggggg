package lianxi;

public class SingleChoiceAnswer extends Answer{

	private char answer;
	public SingleChoiceAnswer(char answer) {
		this.answer=answer;
	}
	public void setAnswer(char answer) {
		this.answer=answer;
	}
	public  char getAnswer() {
		return this.answer;
	}
}
