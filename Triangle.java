import java.util.*;

class InvalidRightAngleTriangleException extends Exception
{
}

class Triangle
{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
int a= sc.nextInt();
int b= sc.nextInt();
int c= sc.nextInt();
try
{
if(c*c==(a*a)(b*b))
{
System.out.println("valid triangle");
}

throw new(InvalidRightAngleTriangleException)
{
System.out.println("Invalid triangle");
}
catch(Exception e)
{
System.out.println("valid");
}
}
}
}
