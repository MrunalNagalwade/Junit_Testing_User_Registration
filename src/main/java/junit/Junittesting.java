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
}
