import java.util.*;
import java.io.*;
public class ReverseIn{
  
  public static void main(String args[])
  {
    
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    int n=sc.nextInt();
    System.out.println("the reverse integer is ");
    while(n>0)
    {
      int a=n%10;
      System.out.print(a);
      n=n/10;
      
    }
  }
}
      


