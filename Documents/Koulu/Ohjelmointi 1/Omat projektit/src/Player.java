
public class Player {
	
	String name;
	int [] points = new int [15];
	int bonus = 0;
	int sum = 0;
	int row;
		
	public Player() {
		name = "";
	}

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPoints(int row, int points) {
		this.points[row] = points;
	}
	
	public int getPoints(int row) {
		return points[row];
	}

	public int getTotalPoints() {
		int bonussum = 0;
		for (int i = 0; i<6; i++)
		{
			bonussum = bonussum + points[i];
		}
		if (bonussum >= 63)
		{
			bonus = 50;
		}
		for (int i = 0; i < 15; i++)
		{
			sum = sum + points[i];
		}
		
		return (sum+bonus);
	}
}
