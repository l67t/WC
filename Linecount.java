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
        System.out.println("�ı�����Ϊ"+i);
        fr.close();
        bufr.close();
        }catch(Exception e) {
            System.out.println("�ļ�·�������������������:");
        }
    }
}}}