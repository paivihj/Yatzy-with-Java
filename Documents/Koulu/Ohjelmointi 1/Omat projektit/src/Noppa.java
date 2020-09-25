import java.util.Random;

public class Noppa {
	
	private int arvo;

	public Noppa() {
		arvo = 0;
	}

	public Noppa(int arvo) {
		this.arvo = arvo;
	}

	public int getArvo() {
		return arvo;
	}

	public void setArvo(int arvo) {
		this.arvo = arvo;
	}

	public void heitaNoppaa() {
		Random rand = new Random();
		arvo = rand.nextInt(5);
		arvo = arvo + 1;
	}
}


