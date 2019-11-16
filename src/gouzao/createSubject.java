package gouzao;

import gouzao.createMath;

public class createSubject {
	public static int number;
	createMath[] p=new createMath[number];
	public void getDate() {
	int count=0;
	for(int i=0;i<number;i++)
	{
	p[i]=new createMath();
	if(p[i].create()!=null) 
	{
	count++;
	System.out.print(p[i].create()+"    ");
	if(count%5==0)
	System.out.println();
	}
	else
	i--;//释放原有对象，为p[i]建立新对象
	}
	count=0;
	for(int i=0;i<number;i++)
	{
	System.out.print(p[i].answer()+"    ");
	count++;
	p[i]=null;//释放对象占用堆内存
	if(count%5==0)
	System.out.println();
	}
	}
	public createMath[] kk() {
	return p;
	}

}
