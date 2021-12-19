package com;

public class practice
{
	public static void main(String[] args)
	{
		String r="rakj124rt";
		
		System.out.println(r.length());
		String q1 = r.substring(0,4);
		String q2 = r.substring(4,7);
		String q3 = r.substring(7,9);
		System.out.println(q1.concat(q3));
		System.out.println(q2);
	}

}
