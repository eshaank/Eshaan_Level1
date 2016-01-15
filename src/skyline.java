import java.util.Random;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class skyline {
	public static void main(String[] args) {
		Tortoise.show();
		Tortoise.setX(100);
		Tortoise.setY(300);
		for (int i = 0; i < 9; i++) {
			int hi = new Random().nextInt(200);
			drawBuilding("small");
			drawBuilding("medium");
			drawBuilding("large");
		}

	}

	static void drawBuilding(String size) {

		Tortoise.setSpeed(10);
		Tortoise.setPenColor(Colors.getRandomColor());
		if (size.equals("small")) {
			Tortoise.move(50);
		}
		if (size.equals("medium")) {
			Tortoise.move(100);
		}
		if (size.equals("large")) {
			Tortoise.move(200);
		}
		Tortoise.turn(90);
		Tortoise.move(50);
		Tortoise.turn(90);
		if (size.equals("small")) {
			Tortoise.move(50);
			Tortoise.setPenColor(Colors.Greens.DarkGreen);
			
		}
		if (size.equals("medium")) {
			Tortoise.move(100);
			Tortoise.setPenColor(Colors.Greens.DarkGreen);
			
		}
		if (size.equals("large")) {
			Tortoise.move(200);
			Tortoise.setPenColor(Colors.Greens.DarkGreen);
		
		}
		Tortoise.turn(-90);
		Tortoise.move(50);
		Tortoise.turn(270);
		
	}
}
