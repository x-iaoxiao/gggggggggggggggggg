package lianxi;

public class BlankCheck implements Check{

	@Override
	public boolean check(Question question, Answer myanswer) {
		Finish_blank blank=(Finish_blank)question;
		boolean flag;
		BlankAnswer answer=(BlankAnswer)myanswer;
		//ֻ��һ���յ����
//		if(blank.getAnswer().length==1) {
//			if(blank.getAnswer()==answer.getAnswer()) {
//				System.out.println("��");
//				flag=true;
//				return true;
//				}
//			else {
//				System.out.println("��");
//				flag=false;
//				return false;
//				}
//		} 
		//�ж���յ����
//		else {
			if(blank.getAnswer().length!=answer.getAnswer().length) {
				System.out.println("��");
				flag=false;
				return false;
				}
		
			else {
				for(int i=0;i<answer.getAnswer().length;i++) {
					String[] temp=answer.getAnswer();
					if(blank.getAnswer()[i]!=temp[i]) {System.out.println("��");flag=false;return false;}
				}
				System.out.println("��");
				flag=true;
				return true;
			}
//		}
	}

}
