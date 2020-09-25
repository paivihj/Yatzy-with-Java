import java.util.ArrayList;
import java.util.Scanner;

public class Yatzy {
	
		
		Noppa dice1 = new Noppa();
		Noppa dice2 = new Noppa();
		Noppa dice3 = new Noppa();
		Noppa dice4 = new Noppa();
		Noppa dice5 = new Noppa();
	
	public void throwDices() {
		
		ArrayList<Noppa> dices= new ArrayList<Noppa>();
		ArrayList<Noppa> newThrow = new ArrayList<Noppa>();
		dices.add(dice1);
		dices.add(dice2);
		dices.add(dice3); 
		dices.add(dice4); 
		dices.add(dice5); 
		int value;
		int j=0;
		
		System.out.println("First throw: ");
		for (int i=0; i<dices.size(); i++) { 
		dices.get(i).heitaNoppaa();
		}
		for (int i=0; i<dices.size(); i++) {
			System.out.print(dices.get(i).getArvo());
		}
		Scanner input = new Scanner(System.in);
		System.out.println("\nWhich dices you choose to throw again. Fill in each separately and when your done fill in 0.");
		do {
			value = input.nextInt();
			for (int i=0; i<dices.size(); i++) {
				if (value == dices.get(i).getArvo())
				{
					newThrow.add(dices.get(i));
					dices.remove(dices.get(i));
				}
			}
			j++;
		}
		while (value !=0 && j<5);
		System.out.println("Second throw: ");
		for (int i=0; i<newThrow.size(); i++) { 
			newThrow.get(i).heitaNoppaa();
			dices.add(newThrow.get(i));
			}
		for (int i=0; i<dices.size(); i++) {
			System.out.print(dices.get(i).getArvo());
		}
		
		System.out.println("\nWhich dices you choose to throw again. Fill in each separately and when your done fill in 0.");
		newThrow.clear();
		do {
			value = input.nextInt();
			for (int i=0; i<dices.size(); i++) {
				if (value == dices.get(i).getArvo())
				{
					newThrow.add(dices.get(i));
					dices.remove(dices.get(i));
				}
			}
			j++;
		}
		while (value !=0 && j<5);
		System.out.println("Third throw: ");
		for (int i=0; i<newThrow.size(); i++) { 
			newThrow.get(i).heitaNoppaa();
			dices.add(newThrow.get(i));
			}
		for (int i=0; i<dices.size(); i++) {
			System.out.print(dices.get(i).getArvo());
		}
	}

	public static void main(String[] args) {
		
		int noPlayers;
		int rounds = 0;
		ArrayList<Player> players = new ArrayList<Player>();
		Yatzy game = new Yatzy();
		
		Scanner cin = new Scanner(System.in);
		System.out.print("How many players there will be? ");
		noPlayers=cin.nextInt();
		cin.nextLine();
		
		while (players.size()<noPlayers)
		{
			Player player = new Player();
			System.out.print("Give players name: ");
			player.setName(cin.nextLine());
			players.add(player);
		}
		
		do {
			for (int i=0; i<players.size(); i++) {
			System.out.println("\nPlayer " + players.get(i).getName() + " throws dices!");
			game.throwDices();
			}
			rounds++;
		}
		while (rounds < 15);
		
		
	}

}
