package main;

import java.util.Date;

//账户类
public class Account {

	String car_id;//卡号
	String keyword;//密码
	String bank;//开户银行
	Person person;//个人信息
	Date date;//办卡日期
	double balance;//余额
	double loan_limit;//贷款额度
	double used_limit;//已用额度
	double n_repay;//待还额度
	public Account(String bank,String keyword,Person person,double balance) {
		this.keyword=keyword;
		int min=0;
		int max=100;
		int result=(int) (min+(Math.random()*((max)+1)));
		Integer r=new Integer(result);
		this.car_id=r.toString();
		this.bank=bank;
		this.person=person;
		this.balance=balance;
	}
	public String getKeyword() {
		return this.keyword;
	}
	public void setKeyword() {
		this.keyword=keyword;
	}
	public String getCar_id() {
		return car_id;
	}
	public void setCar_id(String car_id) {
		this.car_id = car_id;
	}
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
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getLoan_limit() {
		return loan_limit;
	}
	public void setLoan_limit(double loan_limit) {
		this.loan_limit = loan_limit;
	}
	public double getN_repay() {
		return n_repay;
	}
	public void setN_repay(double n_repay) {
		this.n_repay = n_repay;
	}
	
	public double getUsed_limit() {
		return used_limit;
	}
	public void setUsed_limit(double used_limit) {
		this.used_limit = used_limit;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	@Override
	public String toString() {
		return "Account [卡号=" + car_id + ", 开户银行=" + bank + ", 个人信息=" + person
				+ ", 办卡日期=" + date + ", 账户余额=" + balance + ", 可贷额度=" + loan_limit + ", 已用额度="
				+ used_limit + ", 待还款项=" + n_repay + "]";
	}
	@Override
	public boolean equals(Object obj) {
		Account account=(Account)obj;
		if(this.car_id.equals(account.car_id))return true;
		else return false;
	}
}
