import java.util.Stack;

public class RPolandDemo {
	public static void main(String[] args) {
		String exp = "1  / 5";
		String toks[] = exp.trim().split("\\s+");
		Stack<Double> S = new Stack<Double>();
		for (String tok : toks) {
			if (isNumber(tok)) {
				S.push(Double.parseDouble(tok));
			} else {
				double b=S.pop();
				double a=S.pop();
				switch (tok) {
				case "+":
					S.push(a+b);
					break;
				case "-":
					S.push(a-b);
					break;
				case "*":
					S.push(a*b);
					break;
				case "/":
					S.push(a/b);
					break;
				}
			}
		}
		System.out.println(S.peek());
		
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
