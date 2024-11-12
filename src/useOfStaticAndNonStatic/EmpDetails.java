package useOfStaticAndNonStatic;

public class EmpDetails 
{
   public static void main(String[] args) 
   {
	  Emp e1=new Emp();
	  e1.EmpCeoName="Sanghpal";
	  e1.EmpId=101;
	  e1.EmpCeoName="Vaishali";
	  
	  Emp e2=new Emp();
	  e2.EmpCeoName="Vikas";
	  e2.EmpId=102;
	  e2.EmpCeoName="Vaishali";
	  
	  Emp e3=new Emp();
	  e3.EmpCeoName="Aakash";
	  e3.EmpId=103;
	  e3.EmpCeoName="Harshwardhan";
	  
	  e1.StudentInfo();
	  e2.StudentInfo();
	  e3.StudentInfo();
	  
   }
}
