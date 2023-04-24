import java.util.*;

class Ascending
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int arr[]= sc.nextInt();

int i;
try
{
for(i=0;i<arr;i++)
{
System.out.println(arr[4]);
}
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Check the input");
}
}
}