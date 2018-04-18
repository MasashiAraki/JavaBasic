package practice18.entity;

public class Player {
	private String postion, name, country, team;


	public String getPostion() {
		return postion;
	}

	public void setPostion(String postion) {
		this.postion = postion;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}


	@Override
	public String toString() {
		return getPostion() + "," + getName() + "," + getCountry() + "," + getTeam();
	}
}
