class outer
{
static int x=10;
int y=20;
static private int z=30;

static class inner
{
void display()
{
System.out.println(x);
outer obj=new outer();
System.out.println(obj.y);
System.out.println(z);
}
}
}
class InnerNest
{
public static void main(String [] args)
{
outer.inner obj1 = new outer.inner();
obj1.display();
}
}
