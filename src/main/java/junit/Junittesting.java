package junit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
@FunctionalInterface
interface lambdaValidationFun
{
    boolean matchPatternLambda(String input, String pattern);
}

public class Junittesting
{
    boolean checkPattern = false;
    lambdaValidationFun validationFun = (pattern, input) ->  pattern.matches(input);
    public boolean validatefirstname(String first_name) throws UserValidation_Exeption {
        String pattern = "^[A-Z]{1}[a-z]{2,}";
       checkPattern = validationFun.matchPatternLambda(first_name,pattern);
       if(checkPattern == false)
       {
           throw new UserValidation_Exeption(UserValidation_Exeption.ExceptionType.INVALID_FIRSTNAME,"INVALID_FIRSTNAME");
       }
       return checkPattern;
    }
    //FOR LASTNAME
    public boolean validatelastName(String last_Name) throws UserValidation_Exeption {
        String patternLastname = "^([A-Z]{1})([a-z]{2,})$";
        return validationFun.matchPatternLambda(last_Name,patternLastname);
    }
    public boolean validateemail(String email) throws UserValidation_Exeption {
        String patternEmail = "^[a-zA-Z0-9]([-._+]{0,1}[a-zA-Z0-9])*[@]{1}[a-zA-Z0-9]{1,}[.]{1}[a-zA-Z]{2,3}([.]{1}[a-zA-Z]{2,3}){0,1}$";
        return validationFun.matchPatternLambda(email,patternEmail);
    }
    public boolean validamobile(String mobile_number) throws UserValidation_Exeption {
        String patternMobile = "^[0-9]{2}[ ][7,8,9]{1,1}[0-9]{9}$";
        return validationFun.matchPatternLambda(mobile_number,patternMobile);
    }
    //For password
    public boolean validate_Password(String password) throws UserValidation_Exeption {
        String patternPassword = "^[A-Za-z0-9]{8,}$";
        return validationFun.matchPatternLambda(password,patternPassword);
    }
}
