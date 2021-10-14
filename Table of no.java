import java.util.*;

class main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter table you want:-");
    int n=sc.nextInt();
    System.out.println("table of " +n+ ":-");
    printPrimeNumber(n);
  }
  public static void printPrimeNumber(int n)
  {
    for(int i=1;i<=10;i++)
    {
      int table=n*i;
      System.out.println(table);
    }
  }
}