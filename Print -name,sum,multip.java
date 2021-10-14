import java.util.*;

class main
{
  public static void printMyName(String name)
  {
    System.out.println("name="+name);
  }
  
  // main function:---
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    
    // for print name:-
    System.out.println("Enter your name:");
    String name=sc.next();
    printMyName(name);
    
    // for sum of no:-
    System.out.println("Enter two no for add:");
    int x=sc.nextInt();
    int y=sc.nextInt();
    int add_num=addnumber(x,y);
    System.out.println("sum of two no:"+add_num);
    
    // for multiple no:-,
    System.out.println("Enter two no for multp:");
    int a=sc.nextInt();
    int b=sc.nextInt();
    System.out.println("multp of no="+multNumber(a,b));
  }
  
  public static int addnumber(int x,int y)
  {
    int num=x+y;
    return num;
  }
  
  public static int multNumber(int a,int b)
  {
    return a*b;
  }
}