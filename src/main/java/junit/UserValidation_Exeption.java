package junit;

public class UserValidation_Exeption extends Exception{

    public String message;
    enum ExceptionType {INVALID_FIRSTNAME, INVALID_LASTNAME, INVALID_EMAIL, INVALID_MOBILE_NUMBER, INVALID_PASSWORD}
    ExceptionType type;
    public UserValidation_Exeption(ExceptionType type, String message)
    {
        super(message);
        this.type = type;
    }
}
