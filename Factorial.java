import java.util.*;
import java.io.*;
public class Fact{
  
  public static void main(String args[])
  {
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int n=sc.nextInt();
    int fact=1,i;
    for(i=1;i<=n;i++)
    {
      
      fact=fact*i;
      }System.out.println("The factorial number is"+fact);
      }
      }
      

