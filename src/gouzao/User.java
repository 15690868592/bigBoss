package gouzao;

import java.util.Scanner;

import gouzao.createSubject;

public class User {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.println("����������Ҫ����ʽ����");
		Scanner scanner=new Scanner( System.in);
		createSubject.number=scanner.nextInt();
		createSubject p=new createSubject();
		p.getDate();

		}
	

}
