package lista;

import java.time.LocalDate;

public class Tilitapahtuma {
	
	private double maara;
	private LocalDate pvm;
	public Tilitapahtuma() {
		maara = 0;
		pvm = LocalDate.now();
	}
	
	public Tilitapahtuma(double maara, LocalDate pvm) {
		this.maara = maara;
		this.pvm = pvm;
	}

	public double getMaara() {
		return maara;
	}

	public void setMaara(double maara) {
		this.maara = maara;
	}

	public LocalDate getPvm() {
		return pvm;
	}

	public void setPvm(LocalDate pvm) {
		this.pvm = pvm;
	}
	
	

}
