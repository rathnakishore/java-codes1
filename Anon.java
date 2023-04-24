class tri
{
void display()
{
System.out.println("Inside the class triangle");
}
}
class Anon
{
public static void main(String[] args)
{
tri objt= new tri()
{
void display()
{
System.out.println("Inside the Anonymous class triangle");
}
};
objt.display();
}
}