import java.util.ArrayList;
import java.util.Scanner;

public class Yatzy {
				
		Noppa dice1 = new Noppa(0, "a");
		Noppa dice2 = new Noppa(0, "b");
		Noppa dice3 = new Noppa(0, "c");
		Noppa dice4 = new Noppa(0, "d");
		Noppa dice5 = new Noppa(0, "e");
	
	public void throwDices() {
		
		ArrayList<Noppa> dices= new ArrayList<Noppa>();
		dices.add(dice1);
		dices.add(dice2);
		dices.add(dice3); 
		dices.add(dice4); 
		dices.add(dice5); 
		String value;
		int j=0;
		
		System.out.println("First throw: ");
		for (int i=0; i<dices.size(); i++) { 
		dices.get(i).heitaNoppaa();
		}
		for (int i=0; i<dices.size(); i++) {
			System.out.print(dices.get(i).getNimi() + ":" + dices.get(i).getArvo() + " ");
		}
		Scanner input = new Scanner(System.in);
		System.out.println("\nWhich dices you choose to throw again. Fill in each separately and when you're done fill in 0.");
		do {
			value = input.nextLine();
			for (int i=0; i<dices.size(); i++) {
				if (value.contentEquals(dices.get(i).getNimi()))
				{
					dices.get(i).heitaNoppaa();
				}
			}
			j++;
		}
		while (value.equals("0")==false && j<5);
		
		j=0;
		System.out.println("Second throw: ");
			for (int i=0; i<dices.size(); i++) {
				System.out.print(dices.get(i).getNimi() + ":" + dices.get(i).getArvo() + " ");
			}
			System.out.println("\nWhich dices you choose to throw again. Fill in each separately and when you're done fill in 0.");
			do {
				value = input.nextLine();
				for (int i=0; i<dices.size(); i++) {
					if (value.contentEquals(dices.get(i).getNimi()))
					{
						dices.get(i).heitaNoppaa();
					}
				}
				j++;
			}
			while (value.equals("0")==false && j<5);
			
		System.out.println("Third throw: ");
			for (int i=0; i<dices.size(); i++) {
				System.out.print(dices.get(i).getNimi() + ":" + dices.get(i).getArvo() + " ");
			}
	}
	
	/*public void showTable(int j) {
		for (int i=0; i<15; i++) {
			System.out.println(table[i] + ": " + players.get(j).getPoints(i));
		}*/

	public static void main(String[] args) {
		
		String [] table = {"1. Aces", "2. Twos", "3. Threes", "4. Fours", "5. Fives", "6. Sixes", "7. 2 of a kind", "8. Two and two", "9. 3 of a kind", "10. 4 of a kind", "11. Low straight", "12. High straight", "13. Full House", "14. Chance", "15. Yahtzee"};
		int noPlayers;
		int rounds = 0;
		int x;
		int points;
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
			System.out.println("Round " + (rounds+1) + "!");
			for (int i=0; i<players.size(); i++) {
			System.out.println("\nPlayer " + players.get(i).getName() + " throws dices!");
			System.out.println("");
			for (int j=0; j<15; j++) {
				System.out.println(table[j] + ": " + players.get(i).getPoints(j));
			}
			game.throwDices();
			System.out.print("\nOn which row do you want to insert points?");
			x = cin.nextInt();
			System.out.println("How many points?");
			points = cin.nextInt();
			players.get(i).setPoints((x-1), points);
			}
			rounds++;
			for (int k=0; k<players.size(); k++) {
			System.out.print("\n" + players.get(k).getName() + " has " + players.get(k).getTotalPoints() + " points");
			}
		}
		while (rounds < 15);
	
		Player winner = null;
		int winpoints = 0;
		
		for (int i=0; i<players.size(); i++) {
			if (players.get(i).getTotalPoints()>winpoints) {
				winner = players.get(i);
				winpoints = players.get(i).getTotalPoints();
			}
		}
		
		System.out.println("Winner is " + winner.getName());
		
	
	}
}
