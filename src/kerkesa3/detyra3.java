package kerkesa3;
import java.util.Scanner;
public class detyra3 {

	public static void main(String[] args) {

//	    Shkruaj një program që lexon dhe printon numrat e dhënë nga një përdorues
//	    derisa ai të japë një input tjetër tekst, jo numër.
//	    Në përfundim të programit, duhet që të printohet totali i numrave me dy shifra.
		double sum = 0;
	   Scanner in = new Scanner(System.in);
	   double a;
	        do {
	            try {
	                System.out.println("Vendosni nje numer:");
	                a = in.nextDouble();
	                if(a%10 == 0 && a%100 != 0) {
	                	sum += a;
	                }
	                System.out.println("Numeri qe vendoset eshte: " + a);
	            } catch (Exception e){
	                break;
	            }
	        } while (true);
	        
	        System.out.println("totali numerave me 2 shifra eshte: " + sum);

	}

}
