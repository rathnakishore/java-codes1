import java.util.Scanner;

class Employee
{
 int e_id;
 char e_rank;
 void get_details()
 {
   Scanner rk=new Scanner(System.in);
   System.out.println("Enter employee id ");
   e_id=rk.nextInt();
   System.out.println("Enter employee rank ");
   e_rank=rk.next().charAt(0);
   
 }
 void print_employeedetails()
 {
 System.out.println("Employee id: "+e_id);
 System.out.println("Employee rank: "+e_rank);
 }
 }
 class MainEmployee
 {
 public static void main(String[] args)
 {
   Employee obj[]= new Employee[5];
   
   obj[0]= new Employee();
   obj[1]= new Employee();
   obj[2]= new Employee();
   obj[3]= new Employee();
   obj[4]= new Employee();
   System.out.println("\n");
   System.out.println("1. Employee details:  ");
   obj[0].get_details();
   obj[0].print_employeedetails();
   
   System.out.println("\n");
   System.out.println("2. Employee details:  ");
   obj[1].get_details();
   obj[1].print_employeedetails();
   
   System.out.println("\n");
   System.out.println("3. Employee details:  ");
   obj[2].get_details();
   obj[2].print_employeedetails();
   
   System.out.println("\n");
   System.out.println("4. Employee details:  ");
   obj[3].get_details();
   obj[3].print_employeedetails();
   
   System.out.println("\n");
   System.out.println("5. Employee details:  ");
   obj[4].get_details();
   obj[4].print_employeedetails();
   
   
 
 }
 }