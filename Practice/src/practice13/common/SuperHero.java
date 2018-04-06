package practice13.common;

public class SuperHero extends Hero {

	private Item equipment;

	public int attack() {
		return super.attack() + this.equipment.getAdditonalDamage();
	}

	public Item getEquipment() {
		return equipment;
	}

	public void setEqipment(Item equipment) {
		this.equipment = equipment;
	}
}
