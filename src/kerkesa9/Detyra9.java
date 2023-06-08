package kerkesa9;
import java.util.Scanner;
/*. Shkruaj një program që i kërkon përdoruesit të japë dy numra (një numër int dhe një numër double)
 * . Printoni dy numrat e dhënë nga përdoruesi në console dhe printoni shumën e tyre. 
 * Në përfundim të printimit, kërkoni nga përdoruesi nëse ai dëshiron të vazhdojë apo jo dhënien e inputeve. 
 * Nëse po, përsërisni dhe një herë marrjen e dy numrave dhe printimin e numrave dhe shumës së tyre. 
 * Nëse jo, program në fund duhet të printojë: “Falemnderit për inputet tuaja!”*/ 
public class Detyra9 {
public static void main(String [] args) {
	Scanner in=new Scanner(System.in);
	int numri;
	double numri2;
	System.out.println("Jpeni dy numrat nje te plote dhe nje me presje:");
	numri=in.nextInt();
	numri2=in.nextDouble();
	System.out.println(numri+numri2);
String vazhdimi;

System.out.println("Deshironi te vazhdoni mbedhjen e numrave");
vazhdimi=in.next();


	 


if (vazhdimi.equalsIgnoreCase("po")) {
	int numri3;
	double numri4;
	System.out.println("Jepni dy numrat e tjere:");
	numri3=in.nextInt();
	numri4=in.nextDouble();
	System.out.println(numri3+numri4);
	
}
else if (vazhdimi.equalsIgnoreCase("JO")) {
	System.out.println("Falemnderit për inputet tuaja!");

 }


}




}


