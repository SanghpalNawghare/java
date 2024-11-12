package methods;

public class Sample4 
{
   public static void main(String[] args) 
   {
	    Sample4 s4=new Sample4();
	    s4.M5();
	    s4.M6();
	    
   }
   
   public void M5()
   {
	  System.out.println("Non static method call from same class M5");
   }
   
   public void M6()
   {
	   System.out.println("Non static method call from same class M6");
   }
}
