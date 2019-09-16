import java.io.File;

public class ListFilesDemo2 {
    public static void main(String[] args) {
        int x=countFilesNumbers(".");
        System.out.println(x);

    }

    private static int countFilesNumbers(String dir) {
        File f=new File(dir);
        int s=0;
        if(f.isDirectory()){
            String[] flist=f.list();
            for(String sf:flist){
                File temp=new File(f,sf);
                s+=countFilesNumbers(temp.toString());
            }
        }else{
            return 1;
        }
        return s;
    }
}
