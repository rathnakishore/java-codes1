//class Inner
class A
{
int age;
public void show()
{
System.out.println("A class fn");
}
class B
{
public void cofig()
{
System.out.println("B class fn");
}}}
class Cat
{
public static void main(String[] args)
{
A obj=new A();
obj.show();
A,B obj1=new A.B();
obj.cofig;
}
}
