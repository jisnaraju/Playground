/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int switchvar=sc.nextInt();
	    switch (switchvar)
	    {
	       case 1:
	           {
	           int varia=sc.nextInt();
	           int square=varia*varia;
	           System.out.println(square);
	           break;
	           }
	       case 2:
	           {
	           int varia=sc.nextInt();
	           int varib=sc.nextInt();
	           int rec=varia*varib;
	           System.out.println(rec);
	           break;
	           }
	        case 3:
            {
	           int varia=sc.nextInt();
	           int varib=sc.nextInt();
	           double tria=0.5*(varia*varib);
	           int tr=(int)tria;
	           System.out.println(tr);
	           break;
            }
	        case 4:
            {
	           int varia=sc.nextInt();
	           double cir=3.14*(double)varia*(double)varia;
	           System.out.println(cir);
	           break;   
            }
	           
	    }
		
	}
}
