class Box
{
double w, h, d;

Box()
{
w=-1;
h=-1;
d=-1;
}
Box(double a, double b, double c)
{
w=a;
h=b;
d=c;
}
Box(double len)
{
w=h=d=len;
}
Box(Box ob)
{
w=ob.w;
h=ob.w;
d=ob.d;
}
double volume()
{
return w*h*d;
}
}

class Boxweight extends Box
{
double weight;
Boxweight(double a, double b, double c, double d)
{
w=a;
h=b;
d=c;
weight=d;
}
}
class Boxcolor extends Box
{
	String col;
	Boxcolor(double a, double b, double c, String d)
	{
	w=a;
	h=b;
	d=c;
	col=d;
}
}	
class BoxShipment extends Boxweight
{
	double cost;
	BoxShipment(double a, double b, double c, double d, double e)
	super(a,b,c,d);
	cost=e;
	
	
	
class MainBox
{
public static void main(String[] args)
{
Boxweight b1= new Boxweight(10.2,20.1,3.2,4.9);
System.out.println("volume of box1: "+b1.volume());
System.out.println("weight of box1: "+b1.weight);
System.out.println();

Boxweight b2= new Boxweight(5.3,4.0,3.9,2.9);
System.out.println("volume of box2: "+b2.volume());
System.out.println("weight of box2: "+b2.weight);
System.out.println();

Boxcolor b3= new Boxcolor(48.6,56.2,55.3,"orange");
System.out.println("volume of box2: "+b3.volume());
System.out.println("weight of box2: "+b3.col);
System.out.println();


}
}








