package dp.reflect;



public class FactoryDemo {
	
	public static void main(String[] args) {
		Fruit apple =new Apple();
		Fruit orange =new Orange();
		try {
			Fruit orange2=(Fruit) Class.forName("dp.reflect.Orange").newInstance();
			System.out.println(orange2);
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Fruit kiwi=(Fruit) Class.forName("dp.reflect.KiWi").newInstance();
			System.out.println(kiwi);
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
