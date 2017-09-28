package lianxi;

public class BlankAnswer extends Answer{

	private String[] answer;
	public BlankAnswer(String... answer) {
		this.answer=answer;
	}
	public void setAnswer(String[] answer) {
		this.answer=answer;
	}
	public  String[] getAnswer() {
		return this.answer;
	}
}
