import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Codecount {
    Scanner c=new Scanner(System.in);{
    String Pathname=null;
    while((Pathname=c.nextLine())!="") {
    File file=new File(Pathname);{
    try {
        FileReader fr=new FileReader(file);
        char temp[]=new char[4096];
        int a= fr.read(temp);
        if(a==-1) a=a+1;
        System.out.println("�ļ����ַ���Ϊ"+a);
        fr.close();
        }catch(Exception e) {
            System.out.println("·������ȷ,����������·��:");
        }
    
                                 }
    
    }

}}