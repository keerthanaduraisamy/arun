import java.util.*;
import java.io.*;
public class Reverse{
  
  public static void main(String args[])
  {
    
    Scanner sc=new Scanner(System.in);
    String str;
    
    System.out.println("enter the string ");
    str=sc.nextLine();
    int n=str.length();
    int l=n;
    for(int i=0;i<l;i++)
    {
     char c=str.charAt(n-1);
     n--;
     System.out.print(c);
     }
     }
     }
      
      
