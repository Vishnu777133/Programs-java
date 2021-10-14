// find area of circle.

import java.io.*;

class area 
{
  public static void main(String args[])throws IOException
  {
    String s;
    double a,r;
    DataInputStream ds= new DataInputStream(System.in);
    System.out.println("enter radius of circle =");
    s=ds.readLine();
    r=Double.parseDouble(s);
    a=3.14*r*r;
    System.out.println("area of circle="+a);
  }
}