import java.io.*;
// create a calculator
class operators
{
  public static void main(String args[])throws IOException
  {
    DataInputStream ds=new DataInputStream(System.in);
    int a,b,op;
    String s;
    
    System.out.println("enter 1st number:");
    s=ds.readLine();
    a=Integer.parseInt(s);
    
    System.out.println("enter 2nd number:");
    s=ds.readLine();
    b=Integer.parseInt(s);
    
    System.out.println("enter for 1:+, 2:-, 3:*, 4:/, 5:%=");
    s=ds.readLine();
    op=Integer.parseInt(s);
    
    switch(op)
    {
      case 1:
        System.out.println(a+b);
        break;
      case 2:
        System.out.println(a-b);
        break;
      case 3:
        System.out.println(a*b);
        break;
      case 4:
        if(b==0)
        {
          System.out.println("Invalid decision");
        }
        else
        {
          System.out.println(a/b);
        }
        break;
      case 5:
        if(b==0)
        {
          System.out.println("Invalid Decision");
        }
        else
        {
          System.out.println(a%b);
        }
        break;
      default:
        System.out.println("Invalid Operator");
        break;
    }
   }
 }