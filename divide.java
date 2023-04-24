//wap to divide 2 numbers and print the output
import java.util.*;

class divide
{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter two numbers: ");
int a = sc.nextInt();
int b= sc.nextInt();

try
{
int answer=a/b;
int arr[]=new int[5];
arr[6]=19;

}
catch(ArithmeticException x)
{
	System.out.println("Denominator is zero");
}
catch(Exception y)
{
	System.out.println("exception");
}
System.out.println("end");
}
}
