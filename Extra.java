
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Extra {
    Scanner e=new Scanner(System.in);
    String Pathname=null;
    String kregex="(\\s)*[{]?";{
    while((Pathname=e.nextLine())!="") {
        File file=new File(Pathname);{
        try {
            String s=null;
            int a=0,c=0,b=0;
            FileReader fr=new FileReader(file);
            BufferedReader bufr=new BufferedReader(fr);
            while((s=bufr.readLine())!=null) {
                if(s.contains("//"))
                    a++;
                else if(s.matches(kregex))
                    b++;
                else c++;
                }                                                               
            System.out.println("�ı��Ŀ�����Ϊ:"+a);
            System.out.println("�ı���ע������Ϊ:"+b);
            System.out.println("�ı��Ĵ�������Ϊ:"+c);
            fr.close();
            bufr.close();
            }
        catch(Exception e) {
            e.printStackTrace();
            System.out.println("�ļ�·������������������룺");
                           }
                                      }
                                        }
                        
                    }
}
