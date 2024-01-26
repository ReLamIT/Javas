package project;


public class Knight extends Characters{
	
	private Weapon weapon;
	
	public Knight(String name, int health, int stamina, Weapon weapon) {
		super(name, health, stamina);
		this.weapon = weapon;
	}
	public Weapon getWeapon() {
		return weapon;
	}
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	@Override
	public String toString() {
		super.toString();
		return "Knight [weapon=" + weapon + "]";
	}
	
	
	
	
	
}

