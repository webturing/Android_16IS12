import java.io.FileWriter;
import java.io.IOException;

public class CreateJankFile {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("H1.txt");
        while(true){
            fw.write((int) ((Math.random())*256));
        }
        //fw.close();

    }
}
