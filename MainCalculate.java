
class Calculate
{
	void add(int a, int b)
	{
	System.out.println("Addition of two numbers is: "+(a+b) );
	}
	void add(float a, float b)
	{
	System.out.println("Addition of two numbers is: "+(a+b));
	}
	void add(int a, float b)
	{
	System.out.println("Addition of two numbers is: " +(a+b));
	}
	void add(int a, float b, double c)
	{
	System.out.println("Addition of three numbers is: " +(a+b+c));
	}
}
class MainCalculate
{
public static void main(String[] args)
{
	Calculate s=new Calculate();
	s.add(10f,2f);
	}
}
	