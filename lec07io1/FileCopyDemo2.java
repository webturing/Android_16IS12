import java.io.*;

public class FileCopyDemo2 {
    public static void main(String[] args) throws IOException {
        FileReader fis=new FileReader(new File("src","StdIODemo.java"));
        FileWriter fos=new FileWriter("D.txt");

        int x;
        while((x=fis.read())!=-1){
            fos.write(x);
        }


        fis.close();
        fos.close();
    }
}
