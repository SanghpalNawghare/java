package constructor;

public class Sample1 
{
	//Example of default constructor
	
//	Sample()   //provided by compiler
//	{
//		use : To copy all the member into object
//	}
	
    public void M1() 
    {
	   System.out.println("Running method M1");	
	}
    
    public void M2()
    {
	   System.out.println("Running method M2");	
	}
    
    public static void main(String[] args) 
    {
    	//default constructor call from same class
	   	Sample1 s1=new Sample1();
	   	s1.M1();
	   	s1.M2();
	   	
	   	System.out.println("<-------------------------------->");
	   	
	   	Sample2 s2=new Sample2();
	   	s2.M3();
	}
    
    
}
