package practice13.common;

public class SuperHero extends Hero {

	Item equipment;

	public int attack() {
		return this.power + equipment.getAdditonalDamage();
	}
}
