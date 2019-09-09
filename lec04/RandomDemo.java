package lec04;

import java.util.Random;

public class RandomDemo {
	static Random rand = new Random();

	public static void main(String[] args) {

		for (int i = 0; i < 100; i++) {
			System.out.println((int) (Math.random() * 6) + 1);
		}
	}
}
