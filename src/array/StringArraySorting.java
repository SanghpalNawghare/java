package array;

import java.util.Arrays;

public class StringArraySorting 
{
  public static void main(String[] args) 
  {
String [] ar=new String[5];
	  
	  ar[0]="Sanghpal";
	  ar[1]="Vikas";
	  ar[2]="Aakash";
	  ar[3]="Sonu";
	  ar[4]="Sumedh";
	  
	  System.out.println("<----Original data------->");
	  
	  for(int i=0;i<=ar.length-1;i++)
	  {
		  System.out.println(ar[i]);
	  }
	  
	  System.out.println("<------Ascending order----->");
	  
	  Arrays.sort(ar);
	  
	  for(int i=0;i<=ar.length-1;i++)
	  {
		  System.out.println(ar[i]);
	  }
  }
  
}
