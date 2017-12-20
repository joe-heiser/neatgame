package neatgame;

public class Player {
	private int health;
	private int coin;

	public Player(int health, int coin) {
		this.health = health;
		this.coin = coin;
	}

	public void heal() {
		if (this.health > 0) {
			this.health += 20;
		}
		if (this.health >= 100) {
			this.health = 100;
		}

	}

}
