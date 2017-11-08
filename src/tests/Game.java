package tests;

public class Game {

	private int roll=0;
	private int[] rolls = new int [21];

	public void roll(int pinsdown) {
		rolls[roll++]=pinsdown;
	}

	public int score() {
		int score=0;
		score+=pinsdown;
		return score;
	}

}
