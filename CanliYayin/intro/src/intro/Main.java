package intro;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		//değişken isimlendirmeleri Java'da camelCase yazılır.
		String ortaMetin = "İlginizi çekebilir.";
		System.out.println(ortaMetin); // ortaMetin string'ini yazdırır.
		
		// integer - tamsayı
		int vade = 12;
		
		double dolarDun = 18.25;
		double dolarBugun = 18.30;
		
		boolean dolarDustuMu = false;
		
		String okYonu = "";
		
		if (dolarBugun<dolarDun) {
			okYonu = "down.svg";
			System.out.println(okYonu);
		} else if (dolarBugun>dolarDun){
			okYonu = "up.svg";
			System.out.println(okYonu);
		} else {
			okYonu = "equal.svg";
			System.out.println(okYonu);
		}			
		
		// array - diziler
		String[] krediler = {"Hızlı kredi","Maaşını Halkbank'tan alanlar","Mutlu emekli"};
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}

			


	}

}
