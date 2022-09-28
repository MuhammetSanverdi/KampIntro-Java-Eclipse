package intro;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World!");

		String ortaMetin = "İlginizi çekebilir";
		String altMetin = "Vade Süresi";
		
		System.out.println(ortaMetin);
		
		double dolarDun = 18.14;
		double dolarBugun = 18.10;
		
		boolean dolarDustuMu = false;
		
		String okYonu="";
		
		if (dolarBugun<dolarDun) {
			okYonu="down.svg";
			dolarDustuMu=true;
			System.out.println(okYonu);
		}else if (dolarBugun>dolarDun) {
			okYonu="up.svg";
			System.out.println(okYonu);
		}
		else 
		{
			okYonu="equal.svg";
			System.out.println(okYonu);
		}
	}

}
