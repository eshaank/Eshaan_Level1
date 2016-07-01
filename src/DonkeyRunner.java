
public class DonkeyRunner {
public static void main(String[] args) {
	Donkey joe = new Donkey("Joe", true, 13);

	joe.kick();
	joe.butts();
	joe.smile();	
	
	Donkey BO = new Donkey("BO", false, 19);
	BO.kick();
	BO.butts();
	BO.smile();
}
}
