package encapsulation;

public class Sample1 
{
   private int a;
   
   public Sample1()
   {
	  a=10;
   }
   
   public void SquareOfNum()
   {
	   System.out.println(a*a);
   }
   
   public static void main(String[] args) 
   {
	  Sample1 s1=new Sample1();
	  s1.SquareOfNum();
	  System.out.println(s1.a);
   }
}
