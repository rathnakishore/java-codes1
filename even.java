import java.util.Scanner;

class even
{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
System.out.println(" Enter the number : ");
int num=sc.nextInt();
int i=0;
while(i<=100)
{
	if(i%2==0)
	{
System.out.println(num*i);
	}
i++;
};
};
}