import java.io.*;

class p3
{
  public static void main(String args[])throws IOException
  {
    DataInputStream ds=new DataInputStream(System.in);
    String s,sq;
    int eng,sst,maths,sci,lang,total;
    float avg;
     
    System.out.println("enter your name:");
    sq=ds.readLine();
    
    System.out.println("enter your eng number:");
    s=ds.readLine();
    eng=Integer.parseInt(s);
    
    System.out.println("enter your sst number:");
    s=ds.readLine();
    sst=Integer.parseInt(s);
    
    System.out.println("enter your maths number:");
    s=ds.readLine();
    maths=Integer.parseInt(s);
    
    System.out.println("enter your science number:");
    s=ds.readLine();
    sci=Integer.parseInt(s);
    
    System.out.println("enter your language number:");
    s=ds.readLine();
    lang=Integer.parseInt(s);
    
    System.out.println("Name="+sq);
    total=eng+sst+maths+sci+lang;
    System.out.println("Total="+total);
    avg=total/5;
    System.out.println("Average="+avg);
      
  }
}