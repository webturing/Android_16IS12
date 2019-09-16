import java.io.IOException;
import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) throws IOException {
       Scanner cin=new Scanner(System.in);
       while(cin.hasNext()){
           int x=cin.nextInt();
           System.out.println(x);
       }
    }
}
