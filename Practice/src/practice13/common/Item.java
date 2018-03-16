package practice13.common;

public class Item {

	private String name;
	private int additionalDamage;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getAdditonalDamage() {
		return additionalDamage;
	}
	public void setAdditonalDamage(int additionalDamage) {
		this.additionalDamage = additionalDamage;
	}

	public Item(String name, int additionalDamage) {
		this.name = name;
		this.additionalDamage = additionalDamage;
	}
}
