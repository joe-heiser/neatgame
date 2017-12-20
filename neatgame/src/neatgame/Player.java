package neatgame;

import java.util.Random;

public class Player {
	private String name;
	private int health;
	private int coin;
	private int accuracy = 100;
	private int damage = 2;

	public Player(String name, int health, int coin) {
		this.name = name;
		this.health = health;
		this.coin = coin;
	}

	public Player(String name) {
		this.name = name;
		this.health = 100;
		this.coin = 100;
	}

	public void heal() {
		if (this.health > 0) {
			this.health += 20;
		}
		if (this.health >= 100) {
			this.health = 100;
		}

	}

	public void takeDamage(int damage) {
		this.health -= damage;
		if (health <= 0) {
			this.name = "DEAD";
			this.health = 0;
			this.coin = 666;
		}
	}
	
	public String attack(Enemy e) {
		Random rand = new Random();
		if(this.accuracy >= rand.nextInt(100)+1 ) {
			e.takeDamage(this.damage);
			return this.name + " Hit his attack on the enemy!";
		}
		else
		{
			return this.name + " Missed his attack on the enemy!";
		}


	}
	

	@Override
	public String toString() {
		return "Player [name=" + name + ", health=" + health + ", coin=" + coin + "]";
	}

}
