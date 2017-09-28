package lianxi;

public abstract class Question {

//	public int type;
	private String title;
	public Question() {}
	public Question(String title) {
		this.title=title;
//		this.type=type;
	}
//	public void setType(int type) {
//		this.type=type;
//	}
//	public int getType() {
//		return this.type;
//	}
	public void setTitle(String title) {
		this.title=title;
	}
	public String getTitle() {
		return this.title;
	}
//	public abstract boolean check(Answer answer);
	public abstract void showAll(Question question);
}
