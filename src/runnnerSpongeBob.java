
public class runnnerSpongeBob {
	/*
	 * 1. In a Runner class, make Spongebob. Use the methods below to make him eat, and laugh.
	 * 2. Make Patrick and Squidward and print their name, have them eat, and make them laugh.
	 */

public static void main(String[] args) {
	SeaCreature boy = new SeaCreature("Spongebob");
	boy.eat();
	boy.laugh();
	SeaCreature boyss = new SeaCreature("Patrick");
	boyss.eat();
	boyss.laugh();
	SeaCreature boys = new SeaCreature("Squidward");
	boys.eat();
	boys.laugh();
}
}
