package constructor;

public class Sample3 
{
    //example of user defined constructor
	
	//step 1 : variable declaration
	int num1;
	int num2;
	
	//step 2 : variable initialization
	public Sample3() 
	{
		num1=50;
		num2=60;
	}
	
	//step 3 : variable usage
	public void add()
	{
	   System.out.println(num1+num2);	
	}
	
	public void mult()
	{
		System.out.println(num1*num2);
	}
	
	public static void main(String[] args)
	{
	   Sample3 s3=new Sample3();
	   s3.add();
	   s3.mult();
	   
	   System.out.println("<-------------------------------------------------->");
	   
	   Sample4 s4=new Sample4();
	   s4.sub();
	}
}
