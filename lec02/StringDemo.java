import java.util.Arrays;

public class StringDemo {
	public static void main(String[] args) {
		String exp = "   1               2                      +              ";
		String words[] = exp.trim().split("\\s+");
		System.out.println(Arrays.toString(words));
		for (String word : words) {
			try {
				int x = Integer.parseInt(word);
				System.out.println(x);
			} catch (Exception e) {
				System.out.println(word + " is  a operator!");
			}

		}
	}
}
