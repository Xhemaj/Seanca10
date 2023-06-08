package kerkesa2;
import java.util.Scanner;
public class Detyra2 {

	public static void main(String[] args) {
		
		  System.out.println("Vendos nje numer te plote:");
	        Scanner scanner = new Scanner(System.in);
	        int numer = scanner.nextInt();


	        String str = String.valueOf(numer);
	        String newNumber = "";

	        for (int i = str.length() -1; i >= 0; i--) {
	            newNumber += str.charAt(i);
	        }

	        System.out.println("Numeri nga ana e kundert eshte: " + newNumber);

	    }
	}
	

