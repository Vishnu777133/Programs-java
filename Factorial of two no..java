import java.util.*;

// factorial of two no.
// 3!=3*2*1
class main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter no you want:");
    int n=sc.nextInt();
    printFactorial(n);
  }
  
  public static void printFactorial(int n)
  {
    int factorial=1;
    for(int i=n;i>=1;i--)
    {
      factorial=i*factorial;
    }
    System.out.println("factorial of the no="+factorial);
  }
}