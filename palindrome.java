import java.util.*;
import java.io.*;
public class Palindrome{
  
  public static void main(String args[])
  {
    
    Scanner  sc=new Scanner(System.in);
    int n,r,sum=0,temp;
    System.out.println("enter the number "); 
    n=sc.nextInt();
    temp=n;
    while(n>0)
    {
      
      r=n%10;
      n=n/10;
      sum=(sum*10)+r;
      }
      if(temp==sum)
      System.out.println("the given number is palindrome");
      else
      System.out.println("the given mumber is not palindrome");
      }
      }
