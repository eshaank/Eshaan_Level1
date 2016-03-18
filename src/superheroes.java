
public class superheroes {
	String name;
	String power;

	superheroes(String name, String power) {
		this.name = name;
		this.power = power;

	}

	String getName() {
		return name;
	}

	String getPower() {
		return power;
	}

	void setName(String myName) {
		this.name = myName;
	}

	void setPower(String myPower) {
		this.name = myPower;
	}

	public String toString() {
		return name + " has sucky " + power + " skills";
	}
}
