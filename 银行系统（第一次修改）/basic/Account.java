package basic;

import java.math.BigDecimal;
import java.util.Date;

import tools.New_cardId;

//�˻���
public class Account {

	String card_id;//����
	
	String keyword;//����
	
	String bank;//��������
	
	Person person=new Person();//������Ϣ
	
	Date date;//�쿨����
	
	String datedate;//�쿨����2 
	
	BigDecimal balance;//���
	
	BigDecimal loan_limit;//������
	
	BigDecimal used_limit;//���ö��
	
	BigDecimal n_repay;//�������
	
	public Account() {}
	
	public Account(String bank,String keyword,Person person,BigDecimal balance) {
		
		New_cardId card_id=new New_cardId(); 
		this.card_id=card_id.new_cardId();
		this.keyword=keyword;
		this.bank=bank;
		this.person=person;
		this.balance=balance;
		
	}
	
	public String getKeyword() {
		return this.keyword;
	}
	
	public void setKeyword(String keyword) {
		this.keyword=keyword;
	}
	public String getCar_id() {
		return card_id;
	}
	
//	public void setCar_id(String car_id) {
//		this.card_id = car_id;
//	}
	
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	public BigDecimal getLoan_limit() {
		return loan_limit;
	}
	public void setLoan_limit(BigDecimal loan_limit) {
		this.loan_limit = loan_limit;
	}
	public BigDecimal getN_repay() {
		return n_repay;
	}
	public void setN_repay(BigDecimal n_repay) {
		this.n_repay = n_repay;
	}
	
	public BigDecimal getUsed_limit() {
		return used_limit;
	}
	public void setUsed_limit(BigDecimal used_limit) {
		this.used_limit = used_limit;
	}
	public String getCard_id() {
		return card_id;
	}

	public void setCard_id(String card_id) {
		this.card_id = card_id;
	}

	
	public String getDatedate() {
		return datedate;
	}

	public void setDatedate(String datedate) {
		this.datedate = datedate;
	}

	@Override
	public String toString() {
		
		return "Account [����=" + card_id + ", ��������=" + bank + ", ������Ϣ=" + person
				+ ", �쿨����=" + date + ", �˻����=" + balance + ", �ɴ����=" + loan_limit + ", ���ö��="
				+ used_limit + ", ��������=" + n_repay + "]";
		
	}
	
	
	@Override
	public boolean equals(Object obj) {
		
		Account account=(Account)obj;
		if(this.card_id.equals(account.card_id))return true;
		else return false;
		
	}
}
