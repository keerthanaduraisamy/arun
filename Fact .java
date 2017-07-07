import java.util.*;
import java.io.*;
public class Fact{
  
  public static void main(String args[])
  {
    
    Scanner sc=new Scanner(System.in);
    int n,i,fact=1;
    System.out.println("enter the number");
    n=sc.nextInt();
    for(i=1;i<=n;i++)
    {
       fact=fact*i;
       }
       System.out.println("the factorial number is :"+fact);
       }
       }  
    
