interface Age {
int x = 21;
void getAge();
}
class Anony
{
public static void main(String[] args)
{
Age oj1 = new Age()
{
public void getAge()
{
System.out.print("Age is " + x);
}
};
oj1.getAge();
}
}