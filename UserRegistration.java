import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
	private static final String NAME_PATTERN = "^[A-Z][a-z]{2,}";

	public boolean validateFirstName(String fName) {
		Pattern pattern = Pattern.compile(NAME_PATTERN);
		return pattern.matcher(fName).matches();
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

	}

}
