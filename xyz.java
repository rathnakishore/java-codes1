import java.util.Scanner;

class xyz
{
public static void main(String[] args)
{
Scanner obj= new Scanner(System.in);
System.out.print("Enter the name : ");
String name = obj.nextLine();

System.out.print("Enter the age : " );
int age=obj.nextInt();

System.out.print("Enter the salary : ");
float salary=obj.nextFloat();

System.out.print("Enter the grade : ");
char grade=obj.next().charAt(0);


System.out.println("Name :" +name);
System.out.println("age : " +age);
System.out.println("salary: " +salary);
System.out.println("grade: " +grade);
}
}