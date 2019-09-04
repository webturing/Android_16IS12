import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<Integer> S=new Stack<Integer>();
		S.push(1);
		S.push(0);
		int b=S.pop();
		int a=S.pop();
		int c=a/b;
		S.push(c);
		System.out.print(S.peek());
	}
}
