package execptionHandling;

public class Example6 
{
   public static void main(String[] args) 
   {
	   String s1="abcd";
	   
	   try 
	   {
		  System.out.println(s1.charAt(5));
	   }  
	   catch (ArrayIndexOutOfBoundsException e) 
	   {
		   System.out.println("ArrayIndexOutOfBoundsException handled");
	   }
	   catch (StringIndexOutOfBoundsException e)
	   {
		   System.out.println("StringIndexOutOfBoundsException handled");
	   }
	   catch (IndexOutOfBoundsException e) 
	   {
		   System.out.println("IndexOutOfBoundsException ");
	   }
	   
	   System.out.println("hello");
   }
}
