class shape
{
	double d1;
	double d2;
	shape(double a, double b)
	{
		d1=a;
		d2=b;
	}
	double area()
	{
	System.out.println("Area of a shape");
	return(1.2);
	}
}
class rectangle extends shape
{
	int x;
	rectangle(double x, double y)
	{
		super(x,y);
	}
	double area()
	{
	System.out.println("Area of a rectangle");
	return d1*d2;
	}
}
class triangle extends shape
{
	triangle(double p, double q)
	{
		super(p,q);
	}
	double area()
	{
	System.out.println("Area of a triangle");
	return 0.5*d1*d2;
	}
}
class Referencemain
{
	public static void main(String[] args)
	{
	shape s1;
		
	shape s=new shape(2.1,3.6);
	s1=s;
	System.out.println(s.area());
		
	rectangle r=new rectangle(2.1,6.3);
	s1=r;
	System.out.println(r.area());
	
	triangle t=new triangle(2.1,6.3);
	s1=t;
	System.out.println(t.area());
	}
}