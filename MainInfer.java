import java.util.Scanner;

class infer
{
int num1;
int num2;

infer()
{
Scanner rk=new Scanner(System.in);
System.out.println("Enter a number: ");
num1=rk.nextInt();
System.out.println("Enter a number: ");
num2=rk.nextInt();
}
int calculate()
{
	int multiply=num1*num2;
	return(multiply);
}
}
class MainInfer
{
public static void main(String[] args)
{
infer k= new infer();
int result=k.calculate();
System.out.println("The product is: " +result);
}
}
