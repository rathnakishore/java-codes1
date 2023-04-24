class Dog
{
	protected String name;
	Dog(String n)
	{
	name=n;
	}
	String getName()
	{
	System.out.println("Name of the dog");
	return name;
	}
	void Speak()
	{
	System.out.println("Bark");
	
	}
}	
class Labrador extends Dog
{
	private String color;
	private int weight;
	Labrador(String n, String c, int w)
	{
	name=n;
	color=c;
	weight=w;
	}
	void Speak()
	{
	System.out.println("woof");
	}
	int breedweight()
	{
	System.out.println("weight :");
	return 25;
	}
}
class Maindog
{
public static void main(String[] args)
{
	Dog d1;
	
	Dog d=new Dog(husky);
	d1=d;
	System.out.println(d.getName());
	
	Labrador d2=new Labrador(husky,pink,22);
	d2=d;
	System.out.println(d.Speak());
	
	}
}
	
	


