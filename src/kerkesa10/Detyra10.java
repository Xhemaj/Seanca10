package kerkesa10;
import java.util.Scanner;
/* Shkruaj një program që kërkon nga përdoruesi dy numra të plotë.
 *  Krijon një metodë që kalon si parametra këto dy numra dhe brenda saj
 *   llogarit numrin e parë në fuqi të numrit të dytë.
 *   Llogarisni rezultatin pa përdorur Math.pow.Psh 
Nëse numri i parë është: 2 
DHE 
Numri i dytë është: 4 
Atëherë rezultati është = 2 x 2 x 2 x 2 
Nëse numri i parë është: 3 
DHE 
Numri i dytë është: 5 
Atëherë rezultati është = 3 x 3 x 3 x 3 x 3 */
public class Detyra10 {

	public static void main(String[] args) {
		Scanner in=new     Scanner(System.in);
		int a,b;
		int rezultat = 1;
		System.out.println("Ju lumtem jepni dy numra te plote");
a=in.nextInt();
b=in.nextInt();

for (int i= 0;i<a;i++) {
      rezultat *=b;
	
}System.out.println(rezultat);
	}
}
