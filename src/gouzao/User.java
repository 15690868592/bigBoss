package gouzao;

import java.util.Scanner;

import gouzao.createSubject;

public class User {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("请输入您需要的算式个数");
		Scanner scanner=new Scanner( System.in);
		createSubject.number=scanner.nextInt();
		createSubject p=new createSubject();
		p.getDate();

		}
	

}
