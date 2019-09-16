import java.io.IOException;

public class StdCopy {

    public static void main(String[] args) throws IOException {
        int x;
        while ((x = System.in.read()) != -1) {
            char c = (char) x;
            System.out.print(c);

        }
    }
}
