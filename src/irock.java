
public class irock {
	public static void main(String[] args) {
		irock hi = new irock();
		irock lel = new irock();
		irock lol = new irock();
		lol.iRock("Eshaan");
		hi.truth("Fall Out Boy");
		lel.echo("candy");
		String best = hi.getTheBest();
		System.out.println(best + "is the best coder.");
		int sum = hi.add(2, 2);
		System.out.println(sum);
		hi.isEven(sum);
		int mult = hi.times(4, 2);
		System.out.println(mult);

	}

	void iRock(String name) {
		System.out.println(name + " rocks");
	}

	void truth(String singer) {
		if (singer.equals("Fall Out Boy")) {
			System.out.println("Fall Out Boy is awesome!!");
		} else {
			System.out.println("They are so annoying");
		}
	}

	void echo(String name) {
		System.out.println(name + " " + name + ".");
	}

	void hello(String lele) {
		for (int i = 0; i < 5; i++) {
			System.out.println("Hello");
		}
	}

	String getTheBest() {
		return "Eshaan";

	}

	int add(int sum, int other) {
		sum = 2;
		other = 2;
		return sum + other;

	}

	void isEven(int even) {
		if (even % 2 == 0) {
			System.out.println(even + " is even");
		} else {
			System.out.println(even + " is odd");
		}

	}

	int times(int trolll, int troll) {
		return trolll * troll;

	}
}
