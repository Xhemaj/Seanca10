package kerkesa8;

import java.util.Scanner;

public class Detyra8 {

	public static void main(String[] args) {
	/*Shkruaj një program që lexon emrin e përdoruesit dhe afishon në console 
 emrin e tij mbrapsht, psh nëse emri i përdoruesit është Amir, të printohet në console "rimA" 
Shkruaj një program që verifikon nëse emri i dhënë nga përdoruesi është palindromë apo jo. 
psh: ABCBA, 15451, RADAR janë palindroma. 
Që një tekst të jetë palindromë duhet që nëse lexohet
 nga e djathta në të majtë dhe nga e majta në të djathtë të ketë të njëjtin vlerë 
psh:  
ABCBA => nëse lexohet nga e majta në të djathtë kemi A B C B A 
 nëse lexohet nga e djathta në të majtë kemi A B C B A */
Scanner in=new Scanner(System.in);
String emri;
System.out.println("Jepni emrin tuaj:");
emri=in.next();
  
String emriMbrapsh="";
for(int x=emri.length()-1;x>=0;x--) {
	emriMbrapsh+=emri.charAt(x);
	
}
System.out.print(emriMbrapsh);
	
boolean palindrome = true;
for (int x=0;x<emri.length();x++) { 
if (emri.charAt(x)!=emriMbrapsh.charAt(x)) {
	palindrome =false;
	
	
 }

}
if (palindrome) {
	System.out.println("PALINDROME");
}
else {
	System.out.println(" NOT A PALINDROME");
}






	}

}