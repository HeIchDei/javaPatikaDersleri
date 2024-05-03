public class Akademisyen extends Calisan {
	private String bolum;
	private String unvan;

	// kalitimda ust sinifin connstructorini kend icinde yaz
	public Akademisyen(String adSoyad, String telefon, String eposta, String bolum, String unvan) {
		super(adSoyad, telefon, eposta);
		this.bolum = bolum;
		this.unvan = unvan;
	}

	public String getBolum() {
		return bolum;
	}

	public void setBolum(String bolum) {
		this.bolum = bolum;
	}

	public String getUnvan() {
		return unvan;
	}

	public void setUnvan(String unvan) {
		this.unvan = unvan;
	}


	public void derseGir(){
		System.out.println(this.getAdSoyad() + " derse giris yapti.");
	}

	@Override
	public void giris(){
		System.out.println(this.getAdSoyad() + " akademisyeni A kapisindan giris yapti.");
	}


}
