import java.io.File;

public class FileConstructorDemo {
    public static void main(String[] args) {
        File dir = new File("src");
        System.out.println(dir.exists());
        System.out.println(dir.isDirectory());
        File file=new File(dir,"StdIODemo.java");
        System.out.println(file.exists());
        System.out.println(file.isDirectory());
    }
}
