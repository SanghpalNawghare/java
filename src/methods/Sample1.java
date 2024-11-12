package methods;

public class Sample1 
{
   public static void main(String[] args) 
   {
	
	   M1();   //method calling     methodName();
	   M2();   //method calling     methodName();
	   M2();   //method calling     methodName();
	   
   }
   
   //static regular method 
   public static void M1()   //user defined method 
   {
	   System.out.println("Running static method call from same class : M1");
   }
   
   //static regular method 
   public static void M2()
   {
	   System.out.println("Running static method call from same class : M2");
   }
}
