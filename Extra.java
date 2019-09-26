
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
            System.out.println("文本的空行数为:"+a);
            System.out.println("文本的注释行数为:"+b);
            System.out.println("文本的代码行数为:"+c);
            fr.close();
            bufr.close();
            }
        catch(Exception e) {
            e.printStackTrace();
            System.out.println("文件路径输入错误，请重新输入：");
                           }
                                      }
                                        }
                        
                    }
}
