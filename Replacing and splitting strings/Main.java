import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   String str1=sc.nextLine();
	   String str2=sc.nextLine();
	   int a=sc.nextInt();
	   String str3=str1.replace(str1,str2);
	   String[] words=str3.split("\\s");
	   for(String w:words)
	   {
	       System.out.println(w);
	   }
	}
}
