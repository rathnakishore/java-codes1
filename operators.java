import java.util.Scanner;

class operators
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.print("Enter a value: ");
int a=sc.nextInt();
int ans=a>>2;
System.out.println("The output is :" +ans);
}
}