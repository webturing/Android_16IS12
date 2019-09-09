import java.sql.Date;
import java.util.Scanner;

public class ExceptionDemo {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		try {
			int x = cin.nextInt();//InputMismatchException
			System.out.println(1/x);//ArithmeticException
			Date d=null;
			System.out.println(d.clone());//NullPointerException 80+%
		} catch (Exception e) {
			e.printStackTrace();
		}

		cin.close();

	}
}
