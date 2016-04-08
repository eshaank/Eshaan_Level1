import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery {
	public static void main(String[] args) {
		int hi = 100;

		String num1 = JOptionPane.showInputDialog("Give me a number from 0 - " + hi);
		String num2 = JOptionPane.showInputDialog("Give me a number from 0 - " + hi);
		String num3 = JOptionPane.showInputDialog("Give me a number from 0 - " + hi);
		String num4 = JOptionPane.showInputDialog("Give me a number from 0 - " + hi);
		String num5 = JOptionPane.showInputDialog("Give me a number from 0 - " + hi);

		int n1 = Integer.parseInt(num1);
		int n2 = Integer.parseInt(num2);
		int n3 = Integer.parseInt(num3);
		int n4 = Integer.parseInt(num4);
		int n5 = Integer.parseInt(num5);

		Random random = new Random();
		int a = random.nextInt(hi);
		int b = random.nextInt(hi);
		int c = random.nextInt(hi);
		int d = random.nextInt(hi);
		int e = random.nextInt(hi);

		if (n1 == a) {
			System.out.println("you win a small prize");
		}
		if (n2 == b) {
			System.out.println("you win a small prize");
		}
		if (n3 == c) {
			System.out.println("you win a small prize");
		}
		if (n4 == d) {
			System.out.println("you win a small prize");
		}
		if (n5 == e) {
			System.out.println("you win a small prize");
		} else {
			System.out.println("come again! you lost");
		}

		System.out.println(a + " , " + b + " , " + c + " , " + d + " , " + e);
	}
}
