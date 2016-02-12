public class petplatypus {
	private String name;
	petplatypus(String name1) {
		name = name1;
	}
	 void sayHi(){
		System.out.println("The platypus " + name + " is smarter than your average platypus.");
	}
	
	public static void main(String[] args) {
		//1. Make an instance of your new pet platypus
		petplatypus johnny = new petplatypus("Johnny");
		//2. Call the sayHi method
		johnny.sayHi();
		//3. Create a constructor in the platypus class so that you can give your platypus a name.
		
	}
	
}

