package SwiggyCoding;

public class Player {
	
	 private int health;
	    private final int strength;
	    private final int attack;

	    public Player(int health, int strength, int attack) {
	        this.health = health;
	        this.strength = strength;
	        this.attack = attack;
	    }

	    public boolean isAlive() {
	        return health > 0;
	    }

	    public void takeDamage(int damage) {
	        health = Math.max(0, health - damage);
	    }

	    public int getHealth() {
	        return health;
	    }

	    public int getStrength() {
	        return strength;
	    }

	    public int getAttack() {
	        return attack;
	    }

	    @Override
	    public String toString() {
	        return "Player{" +
	               "health=" + health +
	               ", strength=" + strength +
	               ", attack=" + attack +
	               '}';
	    }

}
