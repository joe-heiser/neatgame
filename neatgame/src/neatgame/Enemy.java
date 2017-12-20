package neatgame;

import java.util.Random;

public class Enemy {
private String name;
private int damage;
private int accuracy;
public Enemy(String name, int damage, int accuracy) {
	this.name = name;
	this.damage = damage;
	this.accuracy = accuracy;
}


public String attack(Player p) {
	Random rand = new Random();
	if(this.accuracy >= rand.nextInt(100)+1 ) {
		p.takeDamage(this.damage);
		return this.name + " Hit his attack on Jeffy!";
	}
	else
	{
		return this.name + " Missed his attack on Jeffy!";
	}


}

}
