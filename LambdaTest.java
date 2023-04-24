//wap to reverse a string using lambda expression

interface reverseString
{
String fun(String n);
}
class LambdaTest 
{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
{
reverse rev=(str)->
{
String result="";
for(int i = str.length()-1; i >= 0; i--)
result += str.charAt(i);
return result;
};
System.out.println("Enter a word to reverse a String:");
String word = sc.nextLine();
System.out.println(reverse.func(word));
}
}
}

