package com.dev.assignment;

public class Reverse1 {
	public static void main(String[] args) {
		String s="praveen";
		String d ="";
			
		for (int i = s.length()-1;i>=0;i--)
		{
			d+=s.charAt(i);
		}
		System.out.println(d);
		
	} 

} 