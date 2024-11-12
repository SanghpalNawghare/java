package accessSpecifier;

public class Sample20 
{
	//example of protected access specifier
     protected int c;
     
     protected Sample20()
     {
    	 c=30;
     }
     
     protected void SquareOfNum()
     {
    	 System.out.println(c*c);
     }
     
     public static void main(String[] args) 
     {
	     Sample20 s20=new Sample20();
	     s20.SquareOfNum();
	     System.out.println(s20.c);
	 }
}
