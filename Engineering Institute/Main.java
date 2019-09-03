import java.util.Scanner;
class Faculty
{	
public void salary(int baseSalary)
{
	int value = baseSalary;
	System.out.println("Base Salary: "+ value);	
  //write your Faculty class statements
}
}
class CSE extends Faculty
{
public void salary(int baseSalary)
{
 int salary=baseSalary+3000;
  System.out.println("CSE Faculty: "+salary);
  //write your CSE class statements
}
}
class IT extends Faculty
{
public void salary(int baseSalary)
{
	int salary=baseSalary+5000;
	  System.out.println("IT Faculty: "+salary);
  //write your IT class statements
}
}
class ECE extends Faculty
{
public void salary(int baseSalary)
{  
	int salary=baseSalary+4500;
    System.out.println("ECE Faculty: "+salary);
  //write your ECE class statements
}
}

class Main
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int baseSalary=sc.nextInt();
	
	Faculty objj =new Faculty();
	ECE obj = new ECE();
    IT  obj1 =new IT();
    CSE obj2 =new CSE();
    objj.salary(baseSalary);
    obj2.salary(baseSalary);
    obj1.salary(baseSalary);
    obj.salary(baseSalary);
  //implement your required concept here
}

}