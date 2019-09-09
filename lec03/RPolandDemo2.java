import java.util.Stack;

public class RPolandDemo2 {
	public static void main(String[] args) {
		String exp = "1  5 / 1 5/";
		String toks[] = exp.trim().split("\\s+");

		System.out.println(eval(toks));

	}

	public static double eval(String[] toks) {
		Stack<Double> S = new Stack<Double>();
		for (String tok : toks) {
			if (isNumber(tok)) {
				S.push(Double.parseDouble(tok));
			} else {
				if (S.empty())
					return -1;
				double b = S.pop();
				if (S.empty())
					return -1;
				double a = S.pop();
				switch (tok) {
				case "+":
					S.push(a + b);
					break;
				case "-":
					S.push(a - b);
					break;
				case "*":
					S.push(a * b);
					break;
				case "/":
					S.push(a / b);
					break;
				}
			}
		}
		if (S.size() != 1)
			return -1;
		return S.peek();
	}

	private static boolean isNumber(String tok) {
		try {
			double x = Double.parseDouble(tok);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
