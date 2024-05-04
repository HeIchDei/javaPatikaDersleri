public class Patika {
	public static void main(String[] args) {

		// Ata sinif
		//Calisan c1 = new Calisan("Mustada Cetindag","05125125511", "info@patika.dev");

		// subclasses
		//Akademisyen a1 = new Akademisyen("Patika Dev", "1234567892135", "bilgi@patika.dev", "Ceng","doc");
		//Memur m1 = new Memur("Ali Veli", "13221231", "a@patika.dev", "Bilgi islem","09:00-18:00");

		// sub-subclasses
		OgretimGorevlisi o1 = new OgretimGorevlisi("Mahmut Cetindag", "0", "m@p.dev", "CENG", "DOC", "110");
		Asistan as1 = new Asistan("Osman gultekin", "123", "a","MENG","asistan","999");
		BilgiIslem bi1 = new BilgiIslem("Ahmet", "123", "a","MENG","asistan","999");
		GuvenlikGorevlisi g1 = new GuvenlikGorevlisi("Osman", "123", "a","MENG","asistan","Belge");

		// sub-sub-subclasses
		LabAsistani la1 = new LabAsistani("LABAS", "1","2","3","4","5");

		// Method overloading
		//o1.giris("10:00","18:00");

		// Method overriding
		//o1.giris();


		// Polymorphism (Çok biçimlilik)
		//o1.giris();
		//a1.giris();
		//c1.giris();
		//m1.giris();

		//Calisan[] loginUser = {c1,a1,m1,o1};
		//Calisan.girisYapanlar(loginUser);


		// Abstraction (Soyutlama)
		o1.derseGir("10:10");


	}
}
