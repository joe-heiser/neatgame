package neatgame;

import java.util.Random;

public class enemy{
private String name;
private int health;
private int damage;
private double accuracy;

public enemy(String name, int damage, int health) {
	this.name = name;
	this.health = health;
	this.damage = damage;
}

public enemy(String name, int damage) {
	this.name = name;
	this.health = 100;
	this.damage = damage;
}
public void attack(Player p) {
	Random rand = new Random();
	p.takeDamage(this.damage);

}
}