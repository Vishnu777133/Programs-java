import java.io.*;

class forloop
{
  public static void main(String args[])throws IOException
  {
    DataInputStream ds=new DataInputStream(System.in);
    int i,n,total;
    String s;
    
    System.out.println("enter value:");
    s=ds.readLine();
    n=Integer.parseInt(s);
    
    total=0;
    for(i=0;i<=n;i++)
    {
      total=total+i;      
    }
    System.out.println(total);
    
   // int i;
   // for( i=0;i<11;i++)
  //  {
   //   System.out.println(i);
   // }
   
  // int i=0;
  // while(i<11)
//   {
   //  System.out.println(i);
    // i++;
   //}
   
 //  int i=0;
  // do
 //  {
 //    System.out.println(i);
  //   i++;
 //  }
  // while(i<11);
  
  }
}