package com.neuedu.view;

import java.util.Scanner;

import com.neuedu.dao.EmpDao;
import com.neuedu.entity.Emp;

public class EmpView {
	
	private Scanner input = new Scanner(System.in);
	
	public void show(){
		System.out.println("1.���Ա��");
		System.out.println("2.ɾ��Ա��");
		System.out.println("3.�鿴Ա��");
		System.out.println("4.�޸�Ա��");
		System.out.println("��������ѡ����");
		//nextInt����ִ����ɺ������һ���س�
		int index = input.nextInt();
		//���ջس�
		input.nextLine();
		switch (index) {
		case 1:
			addEmp();
			break;
		case 2:
			
			break;
		case 3:
			
			break;
		case 4:
			
			break;
		default:
			break;
		}
	}
	
	/**
	 * ���Ա��
	 */
	public void addEmp(){
		System.out.println("������Ա�����");
		int empno = input.nextInt();
		EmpDao empdao = new EmpDao();
		Emp emp = empdao.getEmpByEmpno(empno);
		if (emp == null) {
			input.nextLine();
			System.out.println("������Ա������");
			String ename = input.nextLine();
			System.out.println("�����빤��");
			int salary = input.nextInt();
			input.nextLine();
			System.out.println("������ְҵ");
			String job = input.nextLine();
			System.out.println("�����벿�ű��");
			int deptno = input.nextInt();
			input.nextLine();
			empdao.addEmp(new Emp(empno, ename, salary, job, deptno));
		}else{
			System.out.println("Ա������Ѿ�����");
		}
	}
	
	
}	
