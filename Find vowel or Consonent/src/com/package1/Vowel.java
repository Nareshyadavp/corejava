package com.package1;

public class Vowel {

	public static void main(String[] args) {
 int vowel=0;
 int consonant =0;
 String a="Hello EveryOne";
 a=a.toLowerCase();
 for(int i=0; i<=a.length();i++) {
	 if(a.charAt(i)=='a'||a.charAt(i)=='e' || a.charAt(i)=='i'|| a.charAt(i)=='o' || a.charAt(i)=='u') {
		 vowel++;
	 }
 
 else if(a.charAt(i)>='a'&& a.charAt(i)>='z');
	 consonant++;
	 System.out.println("no of volwel:"+vowel);
	 System.out.println("no of consonant:"+consonant);
		 
	 }
 }
 
	}


