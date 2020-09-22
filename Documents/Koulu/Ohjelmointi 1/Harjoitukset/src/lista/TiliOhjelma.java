package lista;

import java.util.ArrayList;
import java.util.Scanner;

public class TiliOhjelma {

	public static void main(String[] args) {
		ArrayList<Tili> lista = new ArrayList<Tili>();
		int valinta;
		
		do
		{
		System.out.println("1. Tee tili\n2. Otto\n3. Pano\n4. Näytä tili\n5. Näytä kaikki tilit\n6. Poista tili\n0. Lopetus");
		System.out.print("Anna valintasi (0-6): ");
		Scanner val = new Scanner(System.in);
		valinta = val.nextInt();
		
		switch(valinta)
		{
		case 1: 
		Tili tili1 = new Tili();	
		Scanner cin = new Scanner(System.in);
		System.out.print("Anna tilinumero: ");		
		tili1.setNumero(cin.nextLine());
		System.out.print("Anna alkusaldo: ");
		tili1.setSaldo(cin.nextDouble());
		lista.add(tili1);
		System.out.println("");
		break;
		case 2:
		System.out.print("Anna tilinumero: ");
		val.nextLine();
		String tilinro = val.nextLine();
		Tili oikeatili = null;
		for (int i = 0; i<lista.size(); i++ )
		{
			if (lista.get(i).getNumero().contentEquals(tilinro))
			{
				oikeatili = lista.get(i);
			}
		}
		if (oikeatili == null)
		{
			System.out.println("Tiliä ei ole numerolla " + tilinro);
		}
		else
		{
		System.out.print("Oton määrä: ");
		Scanner otto = new Scanner(System.in);
		oikeatili.Otto(otto.nextDouble());
		System.out.println("Tilin saldo oton jälkeen: " + oikeatili.getSaldo() + "\n");
		}
		break;
		case 3:
		System.out.print("Anna tilinumero: ");
		val.nextLine();
		String tilinro1 = val.nextLine();
		Tili oikeatili1 = null;
			for (int i = 0; i<lista.size(); i++ )
			{
				if (lista.get(i).getNumero().contentEquals(tilinro1))
				{
					oikeatili1 = lista.get(i);
				}
			}
			if (oikeatili1 == null)
			{
				System.out.println("Tiliä ei ole numerolla " + tilinro1 + "\n");
			}
			else
			{
				System.out.print("Panon määrä: ");
				Scanner pano = new Scanner(System.in);
				oikeatili1.Pano(pano.nextDouble());
				System.out.println("Tilin saldo panon jälkeen: " + oikeatili1.getSaldo() + "\n");
			}
			break;
		case 4:
			System.out.print("Anna tilinumero: ");
			val.nextLine();
			String tilinro2 = val.nextLine();
			Tili oikeatili2 = null;
			for (int i = 0; i<lista.size(); i++ )
			{
				if (lista.get(i).getNumero().contentEquals(tilinro2))
				{
					oikeatili2 = lista.get(i);
					System.out.println("Saldo: " + oikeatili2.getSaldo()+ "\n");
				}
			}
			if (oikeatili2 == null)
			{
				System.out.println("Tiliä ei ole numerolla " + tilinro2 + "\n");
			}
			break;
		case 5:
			for (int i = 0; i<lista.size(); i++ )
			{
				System.out.println("Tilinumero: " + lista.get(i).getNumero() + "\nSaldo: " + lista.get(i).getSaldo() + "\n");
			}
			break;
		case 6:
			System.out.print("Anna tilinumero: ");
			val.nextLine();
			String tilinro3 = val.nextLine();
			for (int i = 0; i<lista.size(); i++ )
			{
				if (lista.get(i).getNumero().contentEquals(tilinro3))
				{
					lista.remove(i);
					System.out.println("Tili poistettiin numerolla " + tilinro3 + "\n");
				}
				else if (i == (lista.size()-1) && lista.get(i).getNumero()!=tilinro3)
			{
				System.out.println("Tiliä ei ole numerolla" + tilinro3 + "\n");
			}
			}	
		break;
		}
		}
		while (valinta != 0);
	}
}
