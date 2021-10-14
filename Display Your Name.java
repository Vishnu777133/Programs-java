// disply your name.

import java.io.*;

class samplhw1
{
  public static void main(String args[])throws IOException
  {
    String s;
    DataInputStream ds= new DataInputStream(System.in);
    
    System.out.println("enter your name:");
    s=ds.readLine();
    System.out.println("Name="+s);
    
  }
}

 