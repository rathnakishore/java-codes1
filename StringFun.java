import java.util.*;

interface StringFunc 
{
String func(String n);
}

public class StringFun 
{
public static void main(String args[]) 
{
Scanner sc = new Scanner(System.in);
StringFunc reverse = (str) -> 
{   
String result = "";
for(int i = str.length()-1; i >= 0; i--)
result += str.charAt(i);
return result;
};
System.out.println("Enter a word to reverse :");
String word = sc.nextLine();
System.out.println("The reversed form is: " + reverse.func(word));
}
}