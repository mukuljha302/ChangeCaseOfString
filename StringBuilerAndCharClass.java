package com.test;

public class StringBuilerAndCharClass {

public static void main(String[] args) {
	String abc="Mukul Jha";
	char[] b=abc.toCharArray();
	
	StringBuilder sb=new StringBuilder();
	for(char c:b) {
	if(Character.isUpperCase(c)) {
		sb=sb.append(Character.toLowerCase(c));
	}else if(Character.isLowerCase(c)) {
		sb=sb.append(Character.toUpperCase(c));
	}else {	
		sb=sb.append(c);
	}
	}
	
	System.out.println(sb);
	

}
	
	
	
}
