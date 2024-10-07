import java.io.*;
class CopyFile
{
public static void main(String a[])throws IOException
{
int ch;
FileInputStream fin=new FileInputStream(a[0]);
FileOutputStream fout=new FileOutputStream(a[1]);
while((ch=fin.read())!=-1)
fout.write(ch);
fin.close();
fout.close();
System.out.println("f is copied");
}
}