package lianxi;

public abstract class Choice extends Question {

	private static final String String = null;
	protected String[] options;
	public Choice() {}
	public Choice(String title,String[] options) {
		super(title);
		this.options=options;
	}
	public String[] getOptions() {
		return options;
	}
	public void setOptions(String[] options) {
		this.options = options;
	}
	public static String getString() {
		return String;
	}
//	public abstract boolean check(Answer answer);
	
}
