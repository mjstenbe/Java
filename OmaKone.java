import java.util.Scanner;

public class OmaKone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JuomaAutomaatti omaKone = new JuomaAutomaatti();
			
			System.out.println("*******Juoma-Automaatti*******" + "\n");
			System.out.println("1. Kahvi");
			System.out.println("2. Tee");
			System.out.println("3. Kaakao");
			System.out.println("4. Lopeta");
			System.out.println("\n" + "******************************");
			
			int numero;
			
			Scanner lukija = new Scanner(System.in);
			
			do {
				System.out.println("Valitse numero: ");
				numero = lukija.nextInt();
			
			if (numero == 1) {
				omaKone.valmistaKahvi();
			}
			
			else if (numero == 2) {
				omaKone.valmistaTee();
			}
			
			else if (numero == 3) {
				omaKone.valmistaKaakao();
			}
			
			else if (numero < 0 || numero > 4) {
				System.out.println("Virheellinen valinta");
			}
			
			else {
				System.out.println("Painoit lopeta.");
			}
			}
			while (numero != 4);
}
}
