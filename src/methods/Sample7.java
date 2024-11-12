package methods;

public class Sample7 
{
	//method with 2 parameter
   public static void main(String[] args)
   {
	   add(20, 60);
	   add(150, 350);
	   
	   System.out.println("<-------------------------------------------------------->");
	   
	   Sample7 s7=new Sample7();
	   s7.mult(15, 4);
	   s7.mult(13, 9);
	   
   }
   
   public static void add(int a,int b)
   {
	  System.out.println(a+b);
   }
   
   public void mult(int c,int d) 
   {
	  System.out.println(c*d);
   }
}
