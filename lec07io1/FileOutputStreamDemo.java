import java.io.*;

public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("B.txt",true);
        for(int x=48;x<=58;x++){
            fos.write(x);
        }
        for(char c='a';c<='z';c++)
            fos.write(c);
        fos.close();


    }
}
