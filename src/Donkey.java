
public class Donkey {
	String name;
	boolean isMale;
	int age;

	Donkey(String name, boolean isMale, int age) {
		this.name = name;
		this.isMale = isMale;
		this.age = age;
	}

	void kick() {
		System.out.println("You just got kicked by " + name);
	}

	void butts() {
		String male = "boy";
		if (!isMale) {
			System.out.println("I kick butts, because I am a weirdo");
		} else {
			System.out.println("I kick butts, because I am a " + male);
		}

	}

	void smile() {
		System.out.println("I smile when you're in pain, because I am imature since I am " + age);
	}
}
