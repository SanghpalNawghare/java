package accessSpecifier;

public class Sample1 
{
	//example of private access specifier
   private int a;
   
   private Sample1()
   {
	   a=10;
   }
   
   private void SquareOFNum()
   {
	   System.out.println(a*a);
   }
   
   public static void main(String[] args) 
   {
	  Sample1 s1=new Sample1();
	  s1.SquareOFNum();
	  System.out.println(s1.a);
   }
}
