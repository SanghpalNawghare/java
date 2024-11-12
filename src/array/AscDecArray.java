package array;

import java.util.Arrays;

public class AscDecArray 
{
   public static void main(String[] args)
   {
	  int [] ar=new int[5];
	  
	  ar[0]=20;
	  ar[1]=50;
	  ar[2]=40;
	  ar[3]=10;
	  ar[4]=30;
	  
	  System.out.println("<----------original data---------------------->");
	  
	  for(int i=0;i<=ar.length-1;i++)
	  {
		  System.out.println(ar[i]);
	  }
	  
	  Arrays.sort(ar);
	  
	  System.out.println("<----------Ascending data----------------->");
	  
	  for(int i=0;i<=ar.length-1;i++)
	  {
		  System.out.println(ar[i]);
	  }
	  
	  System.out.println("<----------Decending data------------------->");
	  
	  for(int i=ar.length-1;i>=0;i--)
	  {
		  System.out.println(ar[i]);
	  }
	     
   }
}
