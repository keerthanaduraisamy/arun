import java.util.*;
import java.io.*;
public class Prime{
  
  public static void main(String args[])
  {
    
    Scanner sc=new Scanner(System.in);
    int n,i,flag=0;
    System.out.println("enter the number");
    n=sc.nextInt();
    int m=n/2;
    for(i=2;i<=m;i++)
    {
      if(n%i==0)
      {
        
      flag=1;
      break;
      }
      
      else
      flag=0;
      }
      if(flag==0)
      System.out.println("the given number is prime");
    else
      System.out.println("the given number is not prime");
      } 
 }
