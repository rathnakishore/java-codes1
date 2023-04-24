//create an interface vehicle with 3 abstract methods 
//void gear change(int x)
//void speedincrease(int x)
//void breaks(int x)
//create 2 classes bike and car implementing the interface vehicle you can include additional data members and functions
//print the final speed and gear of bike and car

interface details
{
	void display();
}
class student
{
String name;
int rollno;
double marks1;
double marks2;
student(String n, int r, double m1, double m2)
{
name=n;
rollno=r;
marks1=m1;
marks2=m2;
}
void print()
{
System.out.println("Name: "+name);
System.out.println("rollno: "+rollno);
System.out.println("marks1: "+marks1);
System.out.println("marks2: "+marks2);
}
}
class Result extends student implements details
{
Result(String n, int r, double m1, double m2)
{
super(n, r, m1, m2);
}
public void display()
{
print();
double average= (marks1+marks2)/2;
System.out.println("average: "+average);
}
}
class Mi
{
public static void main(String[] args)
{
Result r= new Result("sam", 12,87.7,90.50);
r.display();
}
}

