class outer
{
 int x=10;
 
void display()
{
	class Inner
{
int y;
Inner()
{
	x=20;
	y=20;
}
void print()
{
System.out.println("Sum: "+ (x+y));
}
}
Inner obj1=new Inner();
obj1.print();
}
}
class Localdemo
{
public static void main(String[] args)
{
outer obj=new outer();
obj.display();
}
}
