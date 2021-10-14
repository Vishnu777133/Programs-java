// find the area of a rectangle.

import java.io.*;

class samplhw2
{
  public static void main(String args[])throws IOException
  {
    DataInputStream ds= new DataInputStream(System.in);
    String s;
    int a,l,b;
    
    System.out.println("enter lenght:");
    s=ds.readLine();
    l=Integer.parseInt(s);
    System.out.println("enter breath:");
    s=ds.readLine();
    b=Integer.parseInt(s);
    a=l*b;
    System.out.println("area of rectangle:"+a);
  }
}