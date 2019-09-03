//package main;
class MyModel1 {
	int p=2;
	public MyModel1()
	{
		System.out.println("Features of MyModel 1");
		System.out.println("Camera mega pixels: "+ p);
	}
	
    //write your logic here
}
class MyModel2 extends MyModel1 {
	int p=5;
	String m ="Fingerprint";
	int s=5;
	public MyModel2()
	{
		System.out.println("Features of MyModel 2");
		System.out.println("Camera mega pixels: "+ p);
		System.out.println("Lock mechanism: "+m);
		System.out.println("Display size: "+s);
	}
}
class MyModel2T extends MyModel2 {
	int p=16;
	String m ="Fingerprint";
	int s=6;
	public MyModel2T()
	{
		System.out.println("Features of MyModel 2T");
		System.out.println("Camera mega pixels: "+ p);
		System.out.println("Lock mechanism: "+m);
		System.out.println("Display size: "+s);
	}

	}
public class Main 
{
   public static void main(String[] args) 
   {
	   MyModel2T obj=new MyModel2T();
	   
         //write your logic here
   }
}