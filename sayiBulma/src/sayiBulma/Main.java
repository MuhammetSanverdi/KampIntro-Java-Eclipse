package sayiBulma;

public class Main {

	public static void main(String[] args) {
		int[] sayilar = new int[] {1,2,5,7,9,0};
		int aranacak=7;
		boolean varMi=false;
		for (int i : sayilar) {
			if (aranacak==i) {
				varMi=true;
				break;
			}
		}
		String message = varMi==true ? "Sayı var": "Sayı yok";
		System.out.println(message);
	}

}
