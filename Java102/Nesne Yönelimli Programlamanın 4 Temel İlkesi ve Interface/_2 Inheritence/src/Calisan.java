public abstract class Calisan {
	private String adSoyad;
	private String telefon;
	private String eposta;

	Calisan(String adSoyad, String telefon, String eposta){
		this.adSoyad = adSoyad;
		this.telefon = telefon;
		this.eposta = eposta;
	}

	public String getAdSoyad(){
		return this.adSoyad;
	}

	public void setAdSoyad(String adSoyad){
		this.adSoyad = adSoyad;
	}

	public String getTelefon(){
		return this.telefon;
	}

	public void setTelefon(String telefon){
		this.telefon = telefon;
	}

	public String getEposta(){
		return this.eposta = eposta;
	}

	public void setEposta(String eposta){
		this.eposta = eposta;
	}

	public void giris(){
		System.out.println(this.adSoyad + " Universiteye giris yapti.");
	}

	/*public void giris(String girisSaati){
		System.out.println(this.getAdSoyad() + " " + girisSaati + " Saatinde giris yapti");
	}

	public void giris(String girisSaati, String cikisSaati){
		System.out.println(this.getAdSoyad() + " " + girisSaati + " Saatinde giris yapti ve " + cikisSaati + " saatinde cikis yapacak");
	}*/

	public void cikis(){
		System.out.println(this.adSoyad + " Universiteden cikis yapti.");
	}

	public void yemekhane(){
		System.out.println(this.adSoyad + " Yemekhaneye giridi.");
	}

	public static void girisYapanlar(Calisan[] loginUsers){
		for(Calisan c: loginUsers){
			c.giris();
		}
	}


}
