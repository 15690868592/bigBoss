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
	i--;//�ͷ�ԭ�ж���Ϊp[i]�����¶���
	}
	count=0;
	for(int i=0;i<number;i++)
	{
	System.out.print(p[i].answer()+"    ");
	count++;
	p[i]=null;//�ͷŶ���ռ�ö��ڴ�
	if(count%5==0)
	System.out.println();
	}
	}
	public createMath[] kk() {
	return p;
	}

}
