package lec04;

public class DollDemo {
	public static void main(String[] args) {
		int first = 0, second = 0, third = 0;
		for (int i = 0; i < 10000; i++) {
			double x = Math.random();
			if (x < 0.1) {
				System.out.println("1st Prize:Macbook Pro");
				++first;
			} else if (x < 0.1 + 0.2) {
				System.out.println("2nd Prize:Iphone");
				++second;
			} else if (x < 0.1 + 0.2 + 0.3) {
				System.out.println("3rd Prize:Mouse");
				++third;
			} else {
				System.out.println("Sorry");
			}
		}
		System.out.println(first + " " + second + " " + third);
	}
}
