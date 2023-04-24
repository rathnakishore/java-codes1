class Exam
{
int Hindi;
int English;
int Maths;

void display()
{
System.out.println("Marks scored in Hindi: "+Hindi);
System.out.println("Marks scored in English: "+English);
System.out.println("Marks scored in Maths: "+Maths);
}
}
class MainExam
{
public static void main(String[] args)
{
	 Exam E1=new Exam();
	 E1.Hindi=95;
	 E1.Maths=91;
	 E1.display();
}
}
