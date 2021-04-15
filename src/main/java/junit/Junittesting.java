package junit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Junittesting
{
    public boolean validatefirstname(String first_name) throws UserValidation_Exeption {
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}");
        boolean fname;
        try {
            Matcher matcher = pattern.matcher(first_name);
            fname = matcher.find();
        }
        catch (NullPointerException e) {
            throw new UserValidation_Exeption(UserValidation_Exeption.ExceptionType.INVALID_FIRSTNAME, "INVALID_FIRSTNAME");
        }
            return fname;
    }
    //FOR LASTNAME
    public boolean validatelastName(String last_Name) throws UserValidation_Exeption {
        Pattern pattern = Pattern.compile("[A-Z]{1}[a-z]");
        boolean lname;
        try {
            Matcher matcher = pattern.matcher(last_Name);
            lname = matcher.find();
        }
        catch (NullPointerException e)
        {
            throw new UserValidation_Exeption(UserValidation_Exeption.ExceptionType.INVALID_LASTNAME, "INVALID_LASTNAME");
        }
        return lname;
    }
    public boolean validateemail(String email) throws UserValidation_Exeption {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]([-._+]{0,1}[a-zA-Z0-9])*[@]{1}[a-zA-Z0-9]{1,}[.]{1}[a-zA-Z]{2,3}([.]{1}[a-zA-Z]{2,3}){0,1}$");
        boolean email_check;
        try {
            Matcher matcher = pattern.matcher(email);
            email_check = matcher.find();
        }
        catch (NullPointerException e)
        {
            throw new UserValidation_Exeption(UserValidation_Exeption.ExceptionType.INVALID_EMAIL, "INVALID_EMAIL");
        }
        return email_check;
    }
    public boolean validamobile(String mobile_number) throws UserValidation_Exeption {
        Pattern pattern = Pattern.compile("^[0-9]{2}[ ][7,8,9]{1,1}[0-9]{9}$");
        boolean mobilecheck;
        try {
            Matcher matcher = pattern.matcher(mobile_number);
            mobilecheck = matcher.find();
        }
        catch (NullPointerException e)
        {
            throw new UserValidation_Exeption(UserValidation_Exeption.ExceptionType.INVALID_MOBILE_NUMBER, "INVALID_MOBILE_NUMBER");
        }
        return mobilecheck;
    }
    //For password
    public boolean validate_Password(String password) throws UserValidation_Exeption {
        Pattern pattern = Pattern.compile("^[A-Za-z0-9]{8,}$");
        boolean passwordcheck;
        try {
            Matcher matcher = pattern.matcher(password);
            passwordcheck = matcher.find();
        }
        catch (NullPointerException e)
        {
            throw new UserValidation_Exeption(UserValidation_Exeption.ExceptionType.INVALID_PASSWORD, "INVALID_PASSWORD");
        }
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
    // FOR HAPPY MESSAGE
    public boolean check_message(String message) {
        if (message.contains("SAD"))
            System.out.println("SAD");
        else
            System.out.println("HAPPY");
        return true;
    }
}
