class RejectedException extends Exception
{
public RejectedException(String str)
{
super(str);
}
class ExceptionHandlingdemo
{
static void check(int age) throws RejectedException
{
if(age<18)
{
throw new RejectedException ("Person is underage");
else
System.out.println("welcome");
}
}
public static void main(String[] args)
{
try
{
ExceptionHandlingdemo.check(13);
}
catch(RejectedException e)
{
System.out.println(e);
System.out.println("Custom exception");
}
}
}
}
