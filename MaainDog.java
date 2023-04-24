import java.util.*;

class dog
{
protected String name;
String speak;

dog()
{
Scanner as=new Scanner(System.in);
name=as.nextLine();
speak=as.nextLine();
}
void name_p()
{
System.out.print(name);
}
void speak_p()
{
System.out.print(speak);
}
}
class labrador extends dog
{
private String color;
private int weight;
labrador(String name,String color,int weight)
{
this.name=name;
this.color=color;
this.weight=weight;
}
void print_data()
{
System.out.println("Name of the dog is: "+name);
System.out.println("The color is: "+color);
System.out.println("weight is: "+weight);
}
}
class MaainDog
{
	public static void main(String[] args)
	{
	labrador l1=new labrador("bowh","brown",5);
	l1.print_data();
		
	}
}