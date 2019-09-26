import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Wordcount {
    Scanner w=new Scanner(System.in);
    String Pathname=null;{
    while((Pathname=w.nextLine())!="") {
    File file=new File(Pathname);{
    try {
        FileReader fr=new FileReader(file);
        char temp[]=new char[4096];
        int b=0;
        int a= fr.read(temp);
        for(int i=0;i<a;i++) {
            if(temp[i]==' ')
                b++;
            }
        if(a==-1) b=-1;
        System.out.println("文本的单词数为"+(b+1));
        fr.close();
    }catch(Exception e) {
        System.out.print("文件路径输入错误，请重新输入:");
    }
}}}}