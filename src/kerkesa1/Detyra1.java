package kerkesa1;
//Shkruaj një program që llogarit shumën e numrave tek dhe 
//çift që janë më të vegjël se 100 dhe më të mëdhenj se 35
public class Detyra1 {

	public static void main(String[] args) {
	int numratTek = 0;
	int numraCift = 0;
	for (int x = 35; x<100; x++) {
		if (x%2==0 ) {
 numraCift = numraCift +x ;}
		else if (x %2 !=0) {
			numratTek=numratTek+x ; 
			}
		}
	System.out.println("Shuma e numrave tek :\n"+" "+ numratTek);
	System.out.println("Shuma e numrave tek :"+ numraCift);
	 System.out.println("Hello \n"+numratTek+" "+numraCift);
	}
	}
