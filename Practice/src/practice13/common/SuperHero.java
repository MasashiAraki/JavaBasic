package practice13.common;

public class SuperHero extends Hero{

//	equipment 装備
	Item equipment;


	public Item getEquipment() {
		return equipment;
	}

	public void setEquipment(Item equipment) {
		this.equipment = equipment;
	}

	public int attack() {
		return super.attack() +  equipment.getAdditionalDamage();
	}





}
