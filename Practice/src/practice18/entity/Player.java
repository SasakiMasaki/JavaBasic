package practice18.entity;

public class Player {

	private String position;
	private String name;
	private String country;
	private String team;

	public String getPostion() {
		return position;
	}
	public void setPostion(String position) {
		this.position = position;
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

	public String toString(){
		return (position + "," + name + "," + country + "," + team);
	}

}
