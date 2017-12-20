package neatgame;

import java.util.Random;

public class Enemy{
private String name;
private int health;
private int damage;
private int accuracy;

public Enemy(String name, int damage, int health) {
	this.name = name;
	this.health = health;
	this.damage = damage;
	this.accuracy = 100;
}

public Enemy(String name, int damage) {
	this.name = name;
	this.health = 100;
	this.damage = damage;
}
public void attack(Player p) {
	Random rand = new Random();
	if(this.accuracy >= rand.nextInt(100)+1) {
	p.takeDamage(this.damage);
	//hit
	}
	else {
		//miss
	}

}
}