package studio7;

public class Die {
	
	private int numSides;
	
	public Die (int initNumSides) {
		numSides = initNumSides;
	}
	
	public int randomInt() {
		int random = (int)(Math.random()*(numSides)+1);
		return random;
	}
	
	
	public static void main (String[] args) {
		Die newDie = new Die(5);
		System.out.println(newDie.randomInt());
	}
	

}
