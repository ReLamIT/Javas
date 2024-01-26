package project;

public class Weapon {
	
	private int damage;
	private String type;
	
	@Override
	public String toString() {
		return "Weapon [damage=" + damage + ", type=" + type + "]";
	}
	public Weapon(int damage, String type) {
		this.damage = damage;
		this.type = type;
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	

}
