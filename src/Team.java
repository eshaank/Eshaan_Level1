
public class Team {
	public static void main(String[] args) {
		Olympian Ervin = new Olympian("Anthony Ervin", 0, 35, "swimmer", "USA");
		Olympian Phelps = new Olympian("Michael Pehlps", 26, 31, "swimmer", "USA");
		Olympian Lochte = new Olympian("Ryan Lochte", 20, 35, "swimmer", "USA");
		Olympian Katie = new Olympian("Katie Ledecky", 5, 19, "swimmer", "USA");
		Olympian Adrian = new Olympian("Nathan Adrian", 4, 27, "swimmer", "USA");
	
		Ervin.perform();
		Phelps.perform();
		Lochte.perform();
		Katie.perform();
		Adrian.perform();
	
	}
	
}
