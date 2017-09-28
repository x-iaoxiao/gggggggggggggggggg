package Question_and_his_son;

public abstract class Question {

	String text;//Ã‚∏…
	int type;
    Question() {}
	Question(String text) {
		this.text=text;
	}
	String getText() {
		return this.text;
	}
}
