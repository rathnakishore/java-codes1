class StringMain
{
public static void main(String[] args)
{
String s1=new String();
String s2="Hello";
s1="I am  good";
s1=s2;
System.out.println(s1);
System.out.println(s2);
char arr[]={'a','b','c','d'};
String s3=new String(arr);
System.out.println(s3);
byte kc[]={67,68,69,70};
String s4=new String(kc);
System.out.println(s4);
}
}