import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		int mesafe, yas, yolculukTipi;
		double tutar, yasIndirimi, indirimlitutar, ciftYonBiletIndirimi, yasIndirimOrani;
		boolean isError = false;

		System.out.print("Mesafeyı km türünden giriniz: ");
		mesafe = inp.nextInt();

		System.out.print("Yasinizi giriniz: ");
		yas = inp.nextInt();

		System.out.println("Yolculuk tipini giriniz (1 => Tek Yon, 2 => Gidis Donus): ");
		yolculukTipi = inp.nextInt();

		if(mesafe < 0){
			isError = true;
		}

		tutar = mesafe * 0.10;

		if(yas < 12){
			yasIndirimOrani = 0.5;
		}
		else if(yas >= 12 && yas <= 24){
			yasIndirimOrani = 0.10;
		}
		else if(yas >= 65){
			yasIndirimOrani = 0.30;
		}
		else{
			yasIndirimOrani = 0;
		}

		yasIndirimi = tutar * yasIndirimOrani;

		indirimlitutar = tutar - yasIndirimi;

		ciftYonBiletIndirimi = indirimlitutar * 0.20;

		if(yolculukTipi == 1){
			tutar = indirimlitutar;
		} else if(yolculukTipi == 2){
			tutar = (indirimlitutar-ciftYonBiletIndirimi)*2;
		} else{
			isError = true;
		}

		if(isError){
			System.out.println("Hatali veri girdiniz!");
		}else {
			System.out.println("Tutariniz: " + tutar);
		}


	}
}