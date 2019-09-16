import java.io.File;

public class ListFilesDemo {
    public static void main(String[] args) {
        File dir=new File("src");
        System.out.println(dir.exists());
        System.out.println(dir.isDirectory());
        String[] flist=dir.list();
        for(String f:flist)
        {
            System.out.println(new File(dir,f).exists());
            if(f.endsWith(".java"))

            System.out.println(f);
        }
    }
}
