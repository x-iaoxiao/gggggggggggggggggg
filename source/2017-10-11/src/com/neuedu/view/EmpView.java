package com.neuedu.view;

import java.util.Scanner;

import com.neuedu.dao.EmpDao;
import com.neuedu.entity.Emp;

public class EmpView {
	
	private Scanner input = new Scanner(System.in);
	
	public void show(){
		System.out.println("1.添加员工");
		System.out.println("2.删除员工");
		System.out.println("3.查看员工");
		System.out.println("4.修改员工");
		System.out.println("请输入编号选择功能");
		//nextInt方法执行完成后会遗留一个回车
		int index = input.nextInt();
		//回收回车
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
	 * 添加员工
	 */
	public void addEmp(){
		System.out.println("请输入员工编号");
		int empno = input.nextInt();
		EmpDao empdao = new EmpDao();
		Emp emp = empdao.getEmpByEmpno(empno);
		if (emp == null) {
			input.nextLine();
			System.out.println("请输入员工姓名");
			String ename = input.nextLine();
			System.out.println("请输入工资");
			int salary = input.nextInt();
			input.nextLine();
			System.out.println("请输入职业");
			String job = input.nextLine();
			System.out.println("请输入部门编号");
			int deptno = input.nextInt();
			input.nextLine();
			empdao.addEmp(new Emp(empno, ename, salary, job, deptno));
		}else{
			System.out.println("员工编号已经存在");
		}
	}
	
	
}	
