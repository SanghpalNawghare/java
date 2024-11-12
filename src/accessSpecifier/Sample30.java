package accessSpecifier;

public class Sample30 
{
    public int d;
    
    public Sample30()
    {
    	d=40;
    }
    
    public void SquareOfNum()
    {
    	System.out.println(d*d);
    }
    
    public static void main(String[] args)
    {
	    Sample30 s30=new Sample30();
	    s30.SquareOfNum();
	    System.out.println(s30.d);
	}
}
