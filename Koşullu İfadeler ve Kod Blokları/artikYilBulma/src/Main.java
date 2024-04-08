import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int yil;
		String isArtik = "", yes="bir artik yildir.", no="artik bir yil degildir.";

		Scanner inp = new Scanner(System.in);

		System.out.print("Yil giriniz: ");
		yil = inp.nextInt();

		if(yil%100 == 0){
			isArtik = (yil%400 == 0) ? yes : no;
		}
		else if(yil%4 == 0){
			isArtik = yes;
		}
		else{
			isArtik = no;
		}

		System.out.println(yil + " " + isArtik);
	}
}