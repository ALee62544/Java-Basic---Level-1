import java.util.Scanner;
public class substring
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        
        // Question 1 - Length of a name
        System.out.println("--------------------------------------------------------------------");
        
        System.out.println ("What is your name?");
        String myName = sc.nextLine();
        System.out.println("Length of your name = " +myName.length());
        
        // Question 2 - Converting postcode to uppercase
        System.out.println("--------------------------------------------------------------------");
        
        System.out.println ("What is your postcode?");
        String myPostcode = sc.nextLine();
        System.out.println(myPostcode.toUpperCase());
        
        // Question 3 - Password verification
        System.out.println("--------------------------------------------------------------------");
        
        System.out.println ("Enter your password");
        String myPassword1 = sc.nextLine();
        System.out.println ("Enter your password again for verification");
        String myPassword2 = sc.nextLine();
        
        System.out.println(myPassword1.equals(myPassword2)); //Prints True or False
    
        if (myPassword1.equals(myPassword2)){
            System.out.println("Password is valid");
        }
        else {
            System.out.println("Password does not match");
        }
        
        // Question 4 - User enters full name and last name is printed + "Hello"
        System.out.println("--------------------------------------------------------------------");
        
        System.out.println ("Enter your full name with a space in between your first and last name");
        String myFullname = sc.nextLine();
        
        int firstSpaceA = myFullname.indexOf(" ");
        String firstNameA = myFullname.substring(0, firstSpaceA);
        int lastSpaceA = myFullname.lastIndexOf(" ");
        String lastNameA = myFullname.substring(lastSpaceA + 1, myFullname.length());
        
        System.out.println ("Hello " + lastNameA + ".");
        
        
        // Question 5 - User enters their full name (including first, middle, and last) in one string
        System.out.println("--------------------------------------------------------------------");
        
        System.out.println ("Enter your full name with spaces in between your first, middle, and last name");
        String myFullnameinc = sc.nextLine();
       
      
        int firstSpace = myFullnameinc.indexOf(" ");
        String firstName = myFullnameinc.substring(0, firstSpace);
        int lastSpace = myFullnameinc.lastIndexOf(" ");
        String middleName = myFullnameinc.substring(firstSpace + 1 , lastSpace);
        String lastName = myFullnameinc.substring(lastSpace + 1, myFullnameinc.length());
        
        String InitialFirst = firstName.substring(0,1);
        String InitialLast = lastName.substring(0,1);
        
        System.out.println ("Your initials are " + (InitialFirst.toUpperCase()) + "." + (InitialLast.toUpperCase()));
        

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}     
        
        
      
        

//Finding the length of a string
//Hello
