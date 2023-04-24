import java.util.Scanner;

class character
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a String: ");
String a=sc.nextLine();
if(a=='a'||'e'||'i'||'o'||'u')
{
System.out.println(a.indexOf(2));
}
else
System.out.println("It is a consonant");
}
System.out.println("It is a string");
}
}