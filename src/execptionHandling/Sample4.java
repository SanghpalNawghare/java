package execptionHandling;

public class Sample4 
{
   public static void main(String[] args) 
   {
	   String s1="abcd";
	   
	   try
	   {
		  System.out.println(s1.charAt(5));
	   }
	   catch (StringIndexOutOfBoundsException e) 
	   {
		  System.out.println("String index bound execption ");
	   }
	   
	   System.out.println("Hello");
   }
}
