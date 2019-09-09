package lec04;

import java.util.Arrays;

public class Doll2 {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		for (int i = 0; i < a.length; i++) {
			int j = (int) (Math.random() * (a.length - i)) + i;
			int t = a[i];
			a[i] = a[j];
			a[j] = t;
		}
		System.out.println(Arrays.toString(a));
	}
}
