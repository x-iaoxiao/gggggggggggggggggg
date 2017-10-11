package com.test;

import java.util.List;

import com.service.Initservice;

public class Test {

	public static void main(String[] args) {
		
		Initservice service=new Initservice();
		List stus=service.showStu();
		for(Object o:stus) {
			System.out.println(o);
		}
		
	}
}
