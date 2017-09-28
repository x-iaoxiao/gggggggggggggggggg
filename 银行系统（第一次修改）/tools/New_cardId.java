package tools;

//用随机函数生成一个随机的卡号
public class New_cardId {

	public String new_cardId(){
		
	int min=100000;
	
	int max=199999;
	
	int result=(int) (min+(Math.random()*((max)+1)));
	
	Integer r=new Integer(result);
	
	return r.toString();
	
}
}