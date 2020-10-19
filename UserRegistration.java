import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
	private static final String NAME_PATTERN = "^[A-Z][a-z]{2,}";
	private static final String EMAIL_PATTERN = "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$";

	public boolean validateFirstName(String fName) {
		Pattern pattern = Pattern.compile(NAME_PATTERN);
		return pattern.matcher(fName).matches();
	}
	
	public boolean validateLastName(String lName) {
		Pattern pattern = Pattern.compile(NAME_PATTERN);
		return pattern.matcher(lName).matches();
	}
	
	 public boolean validateEmailId(String eMail) {
	        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
	        return pattern.matcher(eMail).matches();
	    }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first name");
		String str1=sc.next();
		UserRegistration userregi=new UserRegistration();
		boolean result=userregi.validateFirstName(str1);
		if(result==true)
			System.out.println("Entered first name is valid");
		else
			System.out.println("Entered first name is invalid");
		System.out.println("Enter last name:");
		String str2=sc.next();
		boolean result1=userregi.validateLastName(str2);
		if(result==true)
			System.out.println("Entered last name is valid");
		else
			System.out.println("Entered last name is invalid");
		System.out.println("Enter Email");
		String str3=sc.next();
		boolean result2=userregi.validateEmailId(str3);
		if(result2==true)
			System.out.println("Entered email is valid");
		else
			System.out.println("Entered email is invalid");

	}

}
