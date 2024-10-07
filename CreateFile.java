import java.io.*;
class CreateFile
{
public static void main(String args[])throws IOException
{
DataInputStream dis=new DataInputStream(System.in);
FileOutputStream fout=new FileOutputStream("myfile.txt");
System.out.println("Enter text(@ at the ent):");
char ch;
while((ch=(char)dis.read())!='@')
fout.write(ch);
fout.close();
}
}