import java.io.*;

public class FileCopyDemo1 {
    public static void main(String[] args) throws IOException {
      //  FileInputStream fis=new FileInputStream(new File("src","StdIODemo.java"));
        FileInputStream fis=new FileInputStream(new File("H1.txt"));
        FileOutputStream fos=new FileOutputStream("C.txt");

        int x;
        while((x=fis.read())!=-1){
            fos.write(x);
        }


        fis.close();
        fos.close();
    }
}
