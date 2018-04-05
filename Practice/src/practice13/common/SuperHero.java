package practice13.common;

public class SuperHero extends Hero {

	Item equipment = new Item("なし", 0);

	public int attack() {
		return super.attack() + equipment.getAdditonalDamage();
	}

	public void setEqName(String name) {
		equipment.setName(name);
	}

	public void setEqAdditionalDamage(int additionalDamage) {
		equipment.setAdditonalDamage(additionalDamage);
	}

}
