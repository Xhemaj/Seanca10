package kerkesa6;
import java.util.Scanner;
public class Detyra6 {

	public static void main(String[] args) {
	//Duke u bazuar në programin e Java Bootcamp 2022, kërkoni nga useri që tju japë 
    //numrin e seancës dhe në bazë të tij printoni në console temën që do të trajtohet në atë seancë. 
		//Nëse numri i dhënë nuk përfshihet në totalin e seancave, printoni mesazhin: 
		//"Moduli i parë nuk përmban një temë për seancën që ju kërkuat!" 
		Scanner in=new   Scanner(System.in) ;
			int seanca ;
			System.out.println("Ju lutem jepni numrin e seances");
			seanca=in.nextInt();
			
			if (seanca == 1) {
				System.out.println("Tema qe trajtohet ne kete seance eshte, cfare eshte java");
			}else if	(seanca == 2) {
					System.out.println("Tema qe trajtohet ne kete seance eshte,krijimi i paketave dhe klasave");
			}else if	(seanca == 3) {
						System.out.println("Tema qe trajtohet ne kete seance eshte,Importi");
			} else if	(seanca == 4) {
							System.out.println("Tema qe trajtohet ne kete seance eshte,variablat dhe llojet e saj");
			}else  {
								
								System.out.println("Moduli i parë nuk përmban një temë për seancën që ju kërkuat!");
								
							}
						}
						
					
			
		
	}


