class var_args
{
void print_varargs(int...a)
{
System.out.println("Number of variable arguments: "+a.length);
for(int i:a)
{
System.out.println(i);
}
}
}
class Mainvarargs
{
public static void main(String[] args)
{
var_args vob=new var_args();
vob.print_varargs();
vob.print_varargs(100);
vob.print_varargs(1,2,3,4,5);
}
}