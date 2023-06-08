package kerkesa4;

public class Detyra4 {
//Shkruaj një program që llogarit rezultatin e serisë së mëposhtme
	//:1 + 1/4 + 1/8 + 1/16 + ... + 1/n ku n = 1605.  
	public static void main(String[] args) {

        double sum = 1;
        double i = 4;
        while (i <= 1605){
            sum = sum + (1/i);
            i=i+i;
        }

        System.out.println("Shuma e serise eshte: " + sum);
        
    }

	}

