package neatgame;

import java.util.Random;


public class Player {
	private String name;
	private int health;
	private int coin;
	private int accuracy = 100;
	private int damage = 2;
	private int xAccel;
	private int yAccel;
	private int xPos;
	private int yPos;
	private int xVel;
	private int yVel;
	
	public int getxAccel() {
		return xAccel;
	}

	public void setxAccel(int xAccel) {
		this.xAccel = xAccel;
	}
	
	public int getyAccel() {
		return yAccel;
	}

	public void setyAccel(int yAccel) {
		this.yAccel = yAccel;
	}
	
	public int getxVel() {
		return xVel;
	}

	public void setxVel(int xVel) {
		this.xVel = xVel;
	}
	
	public int getyVel() {
		return yVel;
	}

	public void setyVel(int yVel) {
		this.yVel = yVel;
	}
	
	public int getxPos() {
		return xPos;
	}

	public void setxPos(int xPos) {
		this.xPos = xPos;
	}
	
	public int getyPos() {
		return yPos;
	}

	public void setyPos(int yPos) {
		this.yPos = yPos;
	}

	


	

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
	public int getHealth() {
		return health;
	}
	
	public String attack(Enemy e) {
		Random rand = new Random();
		if(this.accuracy >= rand.nextInt(100)+1 && e.getHealth() > 0) {
			e.takeDamage(this.damage);
			return this.name + " Hit his attack on the enemy!";
		}
		else if(e.getHealth() > 0)
		{
			return this.name + " Missed his attack on the enemy!";
		}
		else {
			return "that nigga dead";
		}


	}
	

	@Override
	public String toString() {
		return "Player [name=" + name + ", health=" + health + ", coin=" + coin + "]";
	}

}
