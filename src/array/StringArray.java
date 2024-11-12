package array;

public class StringArray 
{
   public static void main(String[] args) 
   {
	  String [] ar=new String[5];
	  
	  ar[0]="Sanghpal";
	  ar[1]="Vikas";
	  ar[2]="Aakash";
	  ar[3]="Sonu";
	  ar[4]="Sumedh";
	  
	  System.out.println(ar.length);
	  System.out.println(ar[2]);
	  
	  System.out.println("<--------------------------------------------->");
	  
	  for(int i=0;i<=ar.length-1;i++)
	  {
		  System.out.println(ar[i]);
	  }
	  
	  
	  
   }
   
}
