package execptionHandling;

public class Sample5 
{
   public static void main(String[] args) 
   {
	  int num1=10;
	  int num2=0;
	  
	  int div=0;
	  
	  try 
	  {
		 div=num1/num2;
	  } 
	  catch (ArithmeticException e)
	  {
		 System.out.println("Arithematic execption handled");
	  }
	  
	  System.out.println("hello");
   }
}
