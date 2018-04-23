package practice13.common;

public class SuperHero extends Hero{

//	equipment 装備
	private Item equipment;


	public Item getEquipment() {
		return equipment;
	}

	public void setEquipment(Item equipment) {
		this.equipment = equipment;
	}

	@Override
	public int attack() {
		return super.attack() +  equipment.getAdditionalDamage();
	}





}
