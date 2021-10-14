import java.io.*;

// print all even numbers and also odd till end.
class justtry
{
  public static void main(String args[])throws IOException
{
  
  DataInputStream ds=new DataInputStream(System.in);
  int n,i;
  String s;
  System.out.println("enter your value:");
  s=ds.readLine();
  n=Integer.parseInt(s);
  
  for(i=1;i<n;i=i+2)
  System.out.println(i);
 
}
}
