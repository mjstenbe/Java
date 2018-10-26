
public class JuomaAutomaatti {
	
	public JuomaAutomaatti() {
		this.teetä = 50;
		this.kahvia = 50;
		this.kaakaota = 50;
	}

	private int teetä;
	private int kahvia;
	private int kaakaota;

	public int getTeetä() {
		return teetä;
	}

	public void setTeetä(int teetä) {
		this.teetä = teetä;
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
		
		if (this.kahvia -10 < 0) { // Hyvä että tsekkaat että raaka-ainetta on tarpeeksi suoritettavaan operaatioon
		this.kahvia = 0;
		System.out.print(" Kahvi on loppu! Täytä säiliö.");
	}
		
		else this.kahvia -= 10;
		
		System.out.println(" Kahvia jäljellä: " + this.kahvia + " yksikköä");
	}

	public void valmistaTee() {
		
		System.out.print("Odota hetki, teesi valmistuu...");
		
		if (this.teetä -10 < 0) {
		this.teetä = 0;
		System.out.print(" Tee on loppu! Täytä säiliö.");
	}
		else this.teetä -= 10;
		
		System.out.println(" Teetä jäljellä: " + this.teetä + " yksikköä");
	}

	public void valmistaKaakao() {
		
		System.out.print("Odota hetki, kaakaosi valmistuu...");
		
		if (this.kaakaota -10 < 0) {
		this.kaakaota = 0;
		System.out.print(" Kaakao on loppu! Täytä säiliö.");
	}
		
		else this.kaakaota -= 10;
		
		System.out.println(" Kaakaota jäljellä: " + this.kaakaota + " yksikköä");
	}
		
		public String toString() {
			return "Kahvia jäljellä: " + this.getKahvia() + " Teetä jäljellä: " + this.getTeetä() + " Kaakaota jäljellä: " + this.getKaakaota();

	}
}
