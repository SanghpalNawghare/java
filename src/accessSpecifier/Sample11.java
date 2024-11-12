package accessSpecifier;

public class Sample11 
{
	//example of default access  specifier
    int b;
   
    Sample11()
   {
      b=20;
   }
   
   void SquareOfNum()
   {
	   System.out.println(b*b);
   }
   
   public static void main(String[] args) 
   {
	   Sample11 s11=new Sample11();
	   s11.SquareOfNum();
	   System.out.println(s11.b);
   }
   
   
}
