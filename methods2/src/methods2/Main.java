package methods2;

public class Main {

	public static void main(String[] args) {
		String mesaj="Bugün hava çok güzel";
		String yeniMesaj = mesaj.substring(0,2);
		System.out.println(yeniMesaj);
		int sayi = topla(1,2);
		int toplam = topla2(2,3,4,5,6,7,8);
		System.out.println(toplam);
	}
	public static void ekle() {
		System.out.println("eklendi");
	}
	public static void sil() {
		System.out.println("silindi");
	}
	public static void guncelle() {
		System.out.println("güncellendi");
	}
	
	public static int topla(int sayi1,int sayi2) {
		return 5;
	}
	public static int topla2(int... sayilar) {
		int toplam=0;
		for (int i : sayilar) {
			toplam+=i;
		}
		return toplam;
	}
	public static String sehirVer() {
		return "Ankara";
	}

}
