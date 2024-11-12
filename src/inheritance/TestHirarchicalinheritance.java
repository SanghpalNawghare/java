package inheritance;

public class TestHirarchicalinheritance
{
   public static void main(String[] args) 
   {
	  Son1 s1=new Son1();
	  s1.Mobile();
	  s1.Car();
	  s1.Money();
	  s1.Home();
	  
	  System.out.println("<-------------------------------------->");
	  
	  Son2 s2=new Son2();
	  s2.Bike();
	  s2.Car();
	  s2.Money();
	  s2.Home();
	  
	  System.out.println("<-------------------------------------->");
	  
	  Son3 s3=new Son3();
	  s3.Business();
	  s3.Car();
	  s3.Money();
	  s3.Home();
   }
}
