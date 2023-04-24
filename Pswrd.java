import java.util.Scanner;

public class Pswrd 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your password: ");
        String abc = sc.nextLine();
        
        try 
		{
            if (abc.length()<8) 
			{
                throw new Exception("Password must be at least 8 characters long.");
            }
            if (!abc.matches(".*\\d.*")) 
			{
                throw new Exception("Password must contain at least one digit.");
            }
            System.out.println("Password is valid.");
        } 
		catch (Exception e) 
		{
            System.out.println("Error: " + e.getMessage());
        }
    }
}
