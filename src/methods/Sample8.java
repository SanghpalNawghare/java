package methods;

//import com.sun.tools.classfile.StackMapTable_attribute.full_frame;

public class Sample8
{
   public static void main(String[] args) 
   {
	  Studentname("Sanghpal");
	  Studentname("Vikas");
	  
	  System.out.println("<------------------------------------------------->");
	  
	  FullName("Sanghpal", "Nawghare");
	  FullName("Vikas", "Padwal");
	   
   }
   
   public static void Studentname(String s1)
   {
	  System.out.println(s1);
   }
   
   public static void FullName(String firstName ,String Lastname)
   {
	  System.out.println(firstName+" "+Lastname);
   }
}
