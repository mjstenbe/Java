
public class JuomaAutomaatti {
	
	public JuomaAutomaatti() {
		this.teet� = 50;
		this.kahvia = 50;
		this.kaakaota = 50;
	}

	private int teet�;
	private int kahvia;
	private int kaakaota;

	public int getTeet�() {
		return teet�;
	}

	public void setTeet�(int teet�) {
		this.teet� = teet�;
	}

	public int getKahvia() {
		return kahvia;
	}

	public void setKahvia(int kahvia) {
		this.kahvia = kahvia;
	}

	public int getKaakaota() {
		return kaakaota;
	}

	public void setKaakaota(int kaakaota) {
		this.kaakaota = kaakaota;
	}
	
	public void valmistaKahvi() {
		
		System.out.print("Odota hetki, kahvisi valmistuu...");
		
		if (this.kahvia -10 < 0) {
		this.kahvia = 0;
		System.out.print(" Kahvi on loppu! T�yt� s�ili�.");
	}
		
		else this.kahvia -= 10;
		
		System.out.println(" Kahvia j�ljell�: " + this.kahvia + " yksikk��");
	}

	public void valmistaTee() {
		
		System.out.print("Odota hetki, teesi valmistuu...");
		
		if (this.teet� -10 < 0) {
		this.teet� = 0;
		System.out.print(" Tee on loppu! T�yt� s�ili�.");
	}
		else this.teet� -= 10;
		
		System.out.println(" Teet� j�ljell�: " + this.teet� + " yksikk��");
	}

	public void valmistaKaakao() {
		
		System.out.print("Odota hetki, kaakaosi valmistuu...");
		
		if (this.kaakaota -10 < 0) {
		this.kaakaota = 0;
		System.out.print(" Kaakao on loppu! T�yt� s�ili�.");
	}
		
		else this.kaakaota -= 10;
		
		System.out.println(" Kaakaota j�ljell�: " + this.kaakaota + " yksikk��");
	}
		
		public String toString() {
			return "Kahvia j�ljell�: " + this.getKahvia() + " Teet� j�ljell�: " + this.getTeet�() + " Kaakaota j�ljell�: " + this.getKaakaota();

	}
}
