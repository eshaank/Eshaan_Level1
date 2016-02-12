// Copyright Wintriss Technical Schools 2013
/* 
 * 1. Watch this smurf cartoon: https://www.youtube.com/watch?v=RqbpzEHuO2g
 * 2. In a Runner class, make a Handy Smurf. Use the methods below to make him eat, and print his name.
 * 
 * 5. Make a Papa Smurf and print his name, hat color and girl or boy.
 * 6. Make a Smurfette and print her name, hat color and girl or boy. */

public class smurfs {

	private String name;
	boolean white;
	boolean female;
	public static void main(String[] args) {
		
		smurfs johnny = new smurfs("Papa Smurf", false, false);
		String name1 = johnny.getName();
		System.out.println(name1);
		String hat = johnny.getHatColor();
		System.out.println(hat);
		String gender = johnny.isGirlOrBoy();
		System.out.println(gender);
		
		smurfs jjack = new smurfs("Handy Smurf", false, false);
		String name2 = jjack.getName();
		System.out.println(name2);
		jjack.eat();
		
		smurfs joe = new smurfs("Smurfette", true, true);
		String name3 = joe.getName();
		System.out.println(name3);
		String hat2 = joe.getHatColor();
		System.out.println(hat2);
		String female = joe.isGirlOrBoy();
		System.out.println(female);
		
	}

	smurfs(String name, boolean white, boolean female) {
		this.name = name;
		this.female = female;
		this.white = white;
	}

	public String getName() {
		return "My name is " + name + ".";
	}

	public void eat() {
		System.out.println("I am Smurf is eating Smurfberries.");
	}

	/* Papa Smurf wears a red hat, all the others are white. */
	public String getHatColor() {
		// 3. Fill in this method
		if (white) {
			return "My hat color is white";
		}
		return "My hat color is red";
	}

	/* Smurfette is the only female Smurf. */
	public String isGirlOrBoy() {
		// 4. Fill in this method
		if (female) {
			return "My gender is female";
		}
		return "My gender is male";
	}
	

}



