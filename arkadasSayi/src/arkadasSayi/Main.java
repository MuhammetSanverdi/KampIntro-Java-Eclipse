package arkadasSayi;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		int sayi1 = 27;
		int sayi2 = 29;
		int total1 =0;
		int total2 =0;
			for (int i = 1; i < sayi1; i++) {
				if (sayi1%i==0) {
					total1+=i;
				
				}}
				for (int i = 1; i < sayi2; i++) {
					if (sayi2%i==0) {
						total2+=i;
					
				}
			}
		
		
		if (sayi1==total1 && sayi2==total1) {
			System.out.println("Arkadaş sayıdır");
		}
		else {
			System.out.println("Arkadaş sayı değildir");
		}

	


	}
}