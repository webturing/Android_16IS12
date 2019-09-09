package dp.reflect;

public class ReflectionDemo {
	public static void main(String[] args) {
		try {
			Object obj = Class.forName("java.util.Date").newInstance();
			System.out.println(obj);
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
