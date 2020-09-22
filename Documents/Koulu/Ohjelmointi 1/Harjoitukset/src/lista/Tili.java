package lista;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Tili {
	
	private String numero;
	private double saldo;
	private Asiakas omistaja;
	private ArrayList<Tilitapahtuma> tapahtumat = null;
		
		Tili()
		{
			numero = "";
			saldo = 0;
			omistaja = null;
			tapahtumat = new ArrayList<Tilitapahtuma>();
		}
		
		Tili(String numero, double saldo, Asiakas omistaja)
		{
			this.numero = numero;
			this.saldo = saldo;
			this.omistaja = omistaja;
			tapahtumat = new ArrayList<Tilitapahtuma>();
			Tilitapahtuma tapahtuma = new Tilitapahtuma();
			tapahtumat.add(tapahtuma);
		}

		public String getNumero() {
			return numero;
		}

		public void setNumero(String numero) {
			this.numero = numero;
		}

		public double getSaldo() {
			return saldo;
		}

		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
		
		public Asiakas getOmistaja() {
			return omistaja;
		}

		public void setOmistaja(Asiakas omistaja) {
			this.omistaja = omistaja;
		}
		
		public ArrayList<Tilitapahtuma> getTilitapahtumat(){
			return tapahtumat;
		}
		
		public void Pano(double raha)
		{
			saldo = saldo + raha;
			Tilitapahtuma tt = new Tilitapahtuma(raha, LocalDate.now());
			tapahtumat.add(tt);
		}
		
		public boolean Otto(double raha)
		{
			if (raha <= saldo)
			{
				saldo = saldo - raha;
				Tilitapahtuma tt = new Tilitapahtuma(-raha, LocalDate.now());
				tapahtumat.add(tt);
				return true;
			}
			else
			{
				return false;
			}
		}

		@Override
		public String toString() {
			return "Tili [numero=" + numero + ", saldo=" + saldo + "]";
		}
}
