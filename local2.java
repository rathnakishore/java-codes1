class outer
{
	int data=10;
int getdata()
{
	return data;
}

class Local2
{
public static void main(String[] args)
{
outer obj=new outer();
if(obj.data<20)
{
class Inner
{
void print()
{
System.out.println("Local Inner class");
System.out.println("data: "+ obj.getdata());
}
}
Inner obj1 = new Inner();
obj1.print();
}
}
}
}