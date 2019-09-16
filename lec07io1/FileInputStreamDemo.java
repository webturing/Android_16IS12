import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) {
        File file=new File("A.txt");
        System.out.println(file.exists());
        try {
            FileInputStream fis=new FileInputStream(file);
            int x;
            while((x=fis.read())!=-1){
                System.out.print((char)x);
            }
            fis.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
