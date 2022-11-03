package studio7;

public class Die {
	private int N;
	
	/**
	 * makes a die of sides N
	 * @param sides
	 */
	public Die(int sides) {
		N = sides;
	}
	
	/**
	 * returns a value of a die side
	 * @return
	 */
	public int thrown() {
		return (int)(Math.random()*N+1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Die test = new Die(12);
		System.out.println(test.thrown());
	}

}
