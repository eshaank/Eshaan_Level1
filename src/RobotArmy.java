
public class RobotArmy {
	public static void main(String[] asd){
		//1. create a new human
Human hi = new Human("Joe");
		//2. create a new Robot army of good and evil robots.
Robot evil = new Robot("Johnny", true);
Robot good = new Robot("Keith", false);
		
		//3. command your robot army to destroy a human
good.battle(good, hi);
	}
}

/**
 * Human Class
 */
class Human {
	String name;
	boolean isAlive;
	
	public Human(String name){
		this.name = name;
		this.isAlive = true;
	}
	public String getName() {
		return name;
	}
	public void die(){
		isAlive = false;
	}
}

/**
 * Robot Class
 */
class Robot {
	boolean isEvil;
	String name;
	int power = 10;
	
	public Robot(String name, boolean isEvil){
		this.name = name;
		this.isEvil = isEvil;
	}
	public String getName(){
		return name;
	}
	public void destroy(Human man){
		if(isEvil){
			System.out.println("Beep Boop Pew! Oh no! the robot " + name + " blasted " + man.getName() + "'s head off!");
			man.die();
		}
		else{
			System.out.println("No!! The robot " + name + " loves " +man.getName());
		}
	
	}
	 void battle(Robot r, Human man){
			if (power > r.power) {
				System.out.println("Yay! " + man.getName() + " has destroyed " + name);
			}
			else {
				System.out.println("Oh well. " + man.getName() + " died to challenging " + name + " in a battle. Human vs. Robot...");
			}
		}
}
