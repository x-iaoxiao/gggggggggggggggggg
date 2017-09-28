package main;

import java.util.Scanner;

//用于从键盘接收信息的类

public class Receive {

    public String receive() {
	Scanner sc=new Scanner(System.in);
	String receive=sc.next();
	return receive;
    }
}