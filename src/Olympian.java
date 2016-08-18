
public class Olympian {
	String name;
	int numOfMedals;
	int age;
	String sport;
	String country;
	int bibNum;
static	 int num = 0;

	public Olympian(String name, int numOfMedals, int age, String sport, String country) {
		this.name = name;
		this.numOfMedals = numOfMedals;
		this.age = age;
		this.sport = sport;
		this.country = country;
		num+=1;
		this.bibNum = num;
	}
	void perform(){
		System.out.println("" + name + " has " + numOfMedals + " medals" + " and is " + age + " years old. " + name + " is also is a " + sport + " that swims for the " + country + ". " + "Their bib number is " + bibNum);
	}

}
