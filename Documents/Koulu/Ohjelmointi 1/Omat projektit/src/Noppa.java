import java.util.Random;

public class Noppa {
	
	private int arvo;
	String nimi;

	public Noppa() {
		arvo = 0;
		nimi = "";
	}

	public Noppa(int arvo, String nimi) {
		this.arvo = arvo;
		this.nimi = nimi;
	}

	public int getArvo() {
		return arvo;
	}

	public void setArvo(int arvo) {
		this.arvo = arvo;
	}

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	public void heitaNoppaa() {
		Random rand = new Random();
		arvo = rand.nextInt(5);
		arvo = arvo + 1;
	}
}


