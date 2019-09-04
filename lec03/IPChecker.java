import java.util.Arrays;

public class IPChecker {
	public static void main(String[] args) {
		String str = "1 .2 .3. 4";
		System.out.println(Arrays.toString(str.split("\\s*\\.\\s*")));
		System.out.println(true == check("192.168.1.1"));
		System.out.println(false == check("192.168.1.257"));
		System.out.println(false == check("168.1.1"));
		System.out.println(false == check("192.168.aa.1"));

	}

	private static boolean check(String str) {
		String ip[] = str.trim().split("\\.");
		if (ip.length != 4)
			return false;
		for (String s : ip) {
			try {
				int x = Integer.parseInt(s);
				if (x < 0 || x > 255)
					return false;
			} catch (Exception e) {
				return false;
			}
		}
		return true;
	}
}
