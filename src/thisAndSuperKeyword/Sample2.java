package thisAndSuperKeyword;

public class Sample2 extends Sample1
{
    int a=20;
    
    public void M1()
    {
    	int a=30;
    	
    	System.out.println(a);   //local variable
    	
    	System.out.println(this.a); //global variable from same class
    	
    	System.out.println(super.a);  //global variable from super class
    	
    	
    }
    
    public static void main(String[] args)
    {
	   Sample2 s2=new Sample2();
	   s2.M1();
	}
}
