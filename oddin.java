import java.util.*;
import java.io.*;
public class OddIntervals
{
  public static void main(String args[])
  {
    
    Scanner sc=new Scanner(System.in);
    int start,end,i;
    start=sc.nextInt();
    end=sc.nextInt();
    for(i=start;i<=end;i++)
    {
      if(i%2!=0)
      System.out.println(i);
      }
    }
    }
