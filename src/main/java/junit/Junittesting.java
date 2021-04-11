package junit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Junittesting
{

    public boolean validatefirstname(String first_name)
    {
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}");
        Matcher matcher = pattern.matcher(first_name);
        boolean fname = matcher.find();
        System.out.println(fname);
        return fname;
    }
    //FOR LASTNAME
    public boolean validatelastName(String lastName)
    {
        Pattern pattern = Pattern.compile("[A-Z]{1}[a-z]");
        Matcher matcher = pattern.matcher(lastName);
        boolean lname = matcher.find();
        return lname;
    }
    public boolean validateemail(String email)
    {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]([-._+]{0,1}[a-zA-Z0-9])*[@]{1}[a-zA-Z0-9]{1,}[.]{1}[a-zA-Z]{2,3}([.]{1}[a-zA-Z]{2,3}){0,1}$");
        Matcher matcher = pattern.matcher(email);
        boolean emailcheck = matcher.find();
        return emailcheck;
    }
    public boolean validamobile(String mobile_number)
    {
        Pattern pattern = Pattern.compile("^[0-9]{2}[ ][7,8,9]{1,1}[0-9]{9}$");
        Matcher matcher = pattern.matcher(mobile_number);
        boolean mobilecheck = matcher.find();
        return mobilecheck;
    }
    //For password
    public boolean validate_Password(String password)
    {
        Pattern pattern = Pattern.compile("^[A-Za-z0-9]{8,}$");
        Matcher matcher = pattern.matcher(password);
        boolean passwordcheck = matcher.find();
        return passwordcheck;
    }
    //For UPPERCASE
    public boolean validate_Uppercase(String password1)
    {
        Pattern pattern = Pattern.compile("^(.*[A-Z]{1}[A-Za-z0-9]{7,})$");
        Matcher matcher = pattern.matcher(password1);
        boolean passwordcheck_Uppercase = matcher.find();
        return passwordcheck_Uppercase;
    }
    //For NUMERIC FIND
    public boolean validate_Numeric(String password2)
    {
        Pattern pattern = Pattern.compile("^(.*[A-Z]{1}[A-Za-z0-9]{8,})$");
        Matcher matcher = pattern.matcher(password2);
        boolean passwordcheck_Numeric= matcher.find();
        return passwordcheck_Numeric;
    }
    //For SPECIAL CHARACTER
    public boolean validate_Special_Character(String password3)
    {
        Pattern pattern = Pattern.compile("^(.*[A-Z]{1,}.*[0-9]{1,}.*[~!@#$%^&*]?[A-Za-z0-9]{5,})$");
        Matcher matcher = pattern.matcher(password3);
        boolean passwordcheck_Special_Character = matcher.find();
        return passwordcheck_Special_Character;
    }
}
