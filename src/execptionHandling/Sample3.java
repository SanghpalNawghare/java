package execptionHandling;

public class Sample3
{
   public static void main(String[] args) 
   {

	   String [] ar= {"akash","vishal","kiran"};
	   
	   try
	   {
		  System.out.println(ar[5]);
	   }
	   catch (ArrayIndexOutOfBoundsException e) 
	   {
		  System.out.println();
	   }
	   
	   System.out.println("hello");
   
   }
}
