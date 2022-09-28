package mukemmelSayi;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		int sayi = 27;
		int total =0;
		for (int i = 1; i < sayi; i++) {
			if (sayi%i==0) {
				total+=i;
			}
		}
		if (total==sayi) {
			System.out.println("Mükemmel sayıdır");
		}
		else {
			System.out.println("Mükemmel sayı değildir");
		}

	}

}
