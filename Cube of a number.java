// First program: find the cube of a number.

import java.io.*;

class samp1
{
  public static void main(String args[])throws IOException
  {
    String s;
    int c,n;
    DataInputStream ds= new DataInputStream(System.in);
    System.out.println("enter a number:");
    s=ds.readLine();
    n=Integer.parseInt(s);
    c=n*n*n;
    System.out.println("cube of number:"+c);
  }
} 