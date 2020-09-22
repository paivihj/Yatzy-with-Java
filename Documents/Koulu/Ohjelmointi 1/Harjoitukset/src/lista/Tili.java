package lista;

import java.util.Scanner;

public class Tili {
	
	private String numero;
	private double saldo;
	private Asiakas omistaja;
		
		Tili()
		{
			numero = "";
			saldo = 0;
			omistaja = null;
		}
		
		Tili(String numero, double saldo, Asiakas omistaja)
		{
			this.numero = numero;
			this.saldo = saldo;
			this.omistaja = omistaja;
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

		public void perustaTili()
		{
			
			System.out.print("Anna tilin omistajan hetu: ");
			Scanner hlo = new Scanner(System.in);
			omistaja.setHetu(hlo.nextLine());
			System.out.print("Anna tilin omistajan nimi: ");
			omistaja.setNimi(hlo.nextLine());
			System.out.print("Anna tilinumero: ");
			Scanner tili = new Scanner(System.in);
			setNumero(tili.nextLine());
			System.out.print("Anna alkusaldo: ");
			setSaldo(tili.nextDouble());
			tili.close();
		}
		
		public void Pano(double raha)
		{
			saldo = saldo + raha;
		}
		
		public boolean Otto(double raha)
		{
			if (raha <= saldo)
			{
				saldo = saldo - raha;
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
