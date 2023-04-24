interface Add_Sub
{
	void add(double x, double y)
	{
	System.out.println(x+y);
	}
	void sub(double x, double y)
	{
	System.out.println(x-y);
	}
}
interface Mul_div
{
	void Mul(double x, double y)
	{
	System.out.println(x*y);
	}
	void div(double x, double y)
	{
	System.out.println(x/y);
	}
}
interface Calculate extends Add_Sub, Mul_div
{
	default void print(double res)
	System.out.println(res);
}
class Mycalculator implements Calculate
{


}

class Maininterface
{
public static void main(String[] args)
{
Mycalculator c= new Mycalculator();
c.add(7.5,8.3);
c.sub(7.5,8.3);
c.mul(7.5,8.3);
c.div(7.5,8.3);
}
	