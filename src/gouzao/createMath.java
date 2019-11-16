package gouzao;

import java.util.Random;

public class createMath {
	Random random=new Random();
	public int number1=random.nextInt(101);
	public int number2=random.nextInt(101);
	public int prep=random.nextInt(101);
	public String create()
	{
	if(prep<=50&&(number1+number2)<=100) 
	{
	return number1+"+"+number2+"=";
	}
	else if(prep>50&&(number1-number2)>=0)
	{
	return number1+"-"+number2+"=";
	}
	return null;
	}
	public int answer() 
	{
	if(prep<=50)
	return (number1+number2);
	else
	return(number1-number2);

	}

}
