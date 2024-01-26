package project;

import java.util.Objects;

public class Characters implements Comparable<Characters> {
	
	private String name;
	private int health;
	private int stamina;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getStamina() {
		return stamina;
	}
	public void setStamina(int stamina) {
		this.stamina = stamina;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Characters other = (Characters) obj;
		return health == other.health && Objects.equals(name, other.name) && stamina == other.stamina;
	}
	
	public Characters(String name, int health, int stamina) {
		this.name = name;
		this.health = health;
		this.stamina = stamina;
	}
	@Override
	public int compareTo(Characters o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
	}
	@Override
	protected Characters clone(){
		// TODO Auto-generated method stub
		try {
			return (Characters) super.clone();
		}
		catch(CloneNotSupportedException e) {
			return null;
			
		}
	}
	
	@Override
	public String toString() {
		return "Characters [name=" + name + ", health=" + health + ", stamina=" + stamina + "]";
	}
	
	
	

	
	
	
}
