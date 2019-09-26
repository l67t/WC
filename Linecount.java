import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
public class Linecount {
    Scanner l=new Scanner(System.in);
    String Pathname=null;{
    while((Pathname=l.nextLine())!="") {
    File file=new File(Pathname);{
        try {
        FileReader fr=new FileReader(file);
        BufferedReader bufr=new BufferedReader(fr);
        int i=0;
        while((bufr.readLine())!=null) {
            i++;
        }
        System.out.println("文本行数为"+i);
        fr.close();
        bufr.close();
        }catch(Exception e) {
            System.out.println("文件路径输入错误，请重新输入:");
        }
    }
}}}