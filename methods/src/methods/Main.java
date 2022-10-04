package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca(5);
		sayiBulmaca(3);
		sayiBulmaca(23);
		sayiBulmaca(1);
	}
	public static void sayiBulmaca(int sayi) {
			int[] sayilar = new int[] {1,2,5,7,9,0};
			int aranacak=sayi;
			boolean varMi=false;
			for (int i : sayilar) {
				if (aranacak==i) {
					varMi=true;
					break;
				}
			}
			String message = varMi==true ? "Sayı mevcuttur"+aranacak: "Sayı mevcut değildir" + aranacak;
			System.out.println(message);
	}

}
