package studio7;

public class HockeyPlayer {
	private String name;
	private int number;
	private boolean isRight;
	
	public HockeyPlayer(String n, int num, boolean r) {
		name = n;
		number = num;
		isRight = r;
	}
	/**
	 * finds the name of the player
	 * @return
	 */
	public String getName() {
		return name;
	}
	/**
	 * finds the number of the players
	 * @return
	 */
	public int getNum() {
		return number;
	}
	
	/**
	 * determines the hand
	 * @return
	 */
	public String handed() {
		if(isRight) {
			return "Right-handed";
		}
		else {
			return "Left-handed";
		}
	}
	/**
	 * average number of goals per game
	 * @return
	 */
	public int avggoals() {
		return (int)(Math.random()*13);
	}
	
	/**
	 * average assists per game
	 * @return
	 */
	public int avgassists() {
		return (int)(Math.random()*22);
	}
	/**
	 * average points per game
	 * @return
	 */
	public int avgpoints() {
		return this.avggoals() + this.avgassists();
	}
	
	/**
	 * total games
	 * @return
	 */
	public int games() {
		return (int)(Math.random()*50);
	}
	/**
	 * total points
	 * @return
	 */
	public int totalPoints() {
		return games() * avgpoints();
	}
	public static void main(String[] args) {
		HockeyPlayer martin = new HockeyPlayer("Andrew D. Martin", 1, true);
		System.out.println(martin.getName() + ", Number " + martin.getNum() + ", played " + martin.games() + " games and accumulated " + martin.totalPoints() + " points");

	}

}
