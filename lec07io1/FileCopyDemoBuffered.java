import java.io.*;

public class FileCopyDemoBuffered {
    public static void main(String[] args) throws IOException {

        BufferedInputStream bis=new BufferedInputStream(new FileInputStream(new File("H1.txt")));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("BC.txt"));

        int x;
        while((x=bis.read())!=-1){
            bos.write(x);
        }


        bis.close();
        bos.close();
    }
}
