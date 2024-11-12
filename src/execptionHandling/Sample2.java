package execptionHandling;

public class Sample2 
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
		  System.out.println(ar[0]);     //alternate solution
	   }
	   
	   System.out.println("hello");
   
   }
}
