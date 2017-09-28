package sc;

import java.util.Arrays;

public class Shopping_car {

	private Item[] items;
	public Shopping_car() {}
	public Shopping_car(Item[] items) {
		this.items=items;
	}
	public Item[] getItems() {
		return items;
	}
	public void setItem(Item item) {
		this.items[0]=item;
	}
	public void addItem(Item item) {
		boolean f=false;
		int index=0;
//		for(int i=0;i<items.length;i++) {
//		if(this.items[i].equals(item))
////if(this.getItems()[i].getProduct().getId().equals(item.getProduct().getId()))
//			this.items[i].setAmount(this.items[i].getAmount()+item.getAmount());
//		else
//		{	
//			Item[] newitem=new Item[this.getItems().length+1];
//			for(int j=0;j<this.getItems().length;j++) {
//				newitem[j]=this.getItems()[j];
//			}
//			newitem[this.getItems().length]=item;
//			this.items=newitem;
//		}
//	    break;
//		}
		for(int i=0;i<items.length;i++) {
			if(this.items[i].equals(item)) {index=i;f=true;break;}
		}
		if(f)
		{
			this.items[index].setAmount(this.items[index].getAmount()+item.getAmount());
		}
		else
			{	
				Item[] newitem=new Item[this.getItems().length+1];
				for(int j=0;j<this.getItems().length;j++) {
					newitem[j]=this.getItems()[j];
				}
				newitem[this.getItems().length]=item;
				this.items=newitem;
			}
	}
//	@Override
//	public String toString() {
//		for(int i=0;i<items.length;i++) items[i].toString();
//		return"";	
//
//	}
	
	public void show() {
		for(Item item:items)System.out.println(item);
	}
	
}
