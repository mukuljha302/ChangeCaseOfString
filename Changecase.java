package com.test;

public class Changecase {

	public static void main(String[] args) {
	
		String abc="Mukul Jha";
		
		char c;
		String output="";
		for(int i=0;i<abc.length();i++) {
			c=abc.charAt(i);
			//65 is for Capital A
			if(c>=65 && c<=90) {
			char temp=(char) (c+32);
			output=output+temp;
			//System.out.println(output);
			}else if(c>96 && c<124) {
				char temp=(char) (c-32);
				output=output+temp;				
			}else{
				char temp=(char) (c);
				output=output+temp;
				
			}
			
		}
		System.out.println(output);
		// TODO Auto-generated method stub

	}

}
