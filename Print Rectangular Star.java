
// print rectangle type star.

class main
{
  public static void main(String args[])
  {
    int n=4;
    int m=5;
    int i,j;
    //outer loop
    for(i=1;i<=n;i++)
    {
      {
      //inner loop
      for(j=1;j<=m;j++)
      {
        if(i==1||j==1||i==n||j==m)
        System.out.print("*");
        else
        System.out.print("+");// for space =+
      }
      System.out.println();
    }      
    }
  }
}