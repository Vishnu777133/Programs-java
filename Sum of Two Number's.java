// program to find the sum of two no.

import java.io.*;
class samp2
{
  public static void  main(String args[])throws IOException
  {
    String s;
    int a,b,c;
    DataInputStream ds= new DataInputStream(System.in);
    System.out.println("enter first no");
    s=ds.readLine();
    a=Integer.parseInt(s);
    
    System.out.println("enter the sec no");
    s=ds.readLine();
    b=Integer.parseInt(s);
    c=a+b;
    System.out.println("sum="+c);
  }
}
