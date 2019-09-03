import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int b=sc.nextInt();
	    int e=sc.nextInt();
	    int base=1;
	    for(int i=1;i<=e;i++)
	    {
	     base*=b;
	    }
	    
		System.out.println(base);
	}
}