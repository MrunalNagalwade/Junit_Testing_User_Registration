package junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Junittest {
    Junittesting junittesting = new Junittesting();
    @Test
    void givenfirstname_WhenStarts_Capitalletter_ReturnTrue()
    {
        try {
            boolean fname = junittesting.validatefirstname(null);
            Assertions.assertTrue(fname);
        }
        catch(UserValidation_Exeption e)
        {
            System.out.println(e.getMessage());
            Assertions.assertEquals(UserValidation_Exeption.ExceptionType.INVALID_FIRSTNAME, e.type);
        }
    }
    @Test
    void givenfirstname_WhenStarts_lower_ReturnFalse()
    {
        try {
            boolean fname = junittesting.validatefirstname("nagalwade");
            Assertions.assertFalse(fname);
        }
        catch(UserValidation_Exeption e)
        {
            System.out.println(e.getMessage());
            Assertions.assertEquals(UserValidation_Exeption.ExceptionType.INVALID_FIRSTNAME, e.type);
        }
    }
    //LAST NAME
    @Test
    void givenlastname_WhenStarts_Capitalletter_ReturnTrue()
    {
        try {
            boolean lname = junittesting.validatelastName("Nagalwade");
            Assertions.assertTrue(lname);
        }
        catch(UserValidation_Exeption e)
        {
            System.out.println(e.getMessage());
            Assertions.assertEquals(UserValidation_Exeption.ExceptionType.INVALID_LASTNAME, e.type);
        }
    }
    @Test
    void givenlastname_WhenStarts_lower_ReturnFalse()
    {
        try {
            boolean lname = junittesting.validatelastName("nagalwade");
            Assertions.assertFalse(lname);
        }
        catch(UserValidation_Exeption e)
        {
            System.out.println(e.getMessage());
            Assertions.assertEquals(UserValidation_Exeption.ExceptionType.INVALID_LASTNAME, e.type);
        }
    }
    //EMAIL
    @Test
    void givenemail_WhenStarts_smallletter_ReturnTrue()
    {
        try {
            boolean email_check = junittesting.validateemail("abc.xyz@bl.co.in");
            Assertions.assertTrue(email_check);
        }
        catch(UserValidation_Exeption e)
        {
            System.out.println(e.getMessage());
           Assertions.assertEquals(UserValidation_Exeption.ExceptionType.INVALID_EMAIL, e.type);
        }
    }
    @Test
    void givenemail_Validation_Fails_ReturnFalse()
    {
        try {
            boolean emailcheck = junittesting.validateemail("xyz@gmail.c");
            Assertions.assertFalse(emailcheck);
        }
        catch(UserValidation_Exeption e)
        {
            System.out.println(e.getMessage());
            Assertions.assertEquals(UserValidation_Exeption.ExceptionType.INVALID_EMAIL, e.type);
        }
    }
    //MOBILE_NUMBER
    @Test
    void given_Mobile_Validaiton_Correct_ReturnTrue()
    {
        try {
            boolean mobilecheck = junittesting.validamobile("91 7887569899");
            Assertions.assertTrue(mobilecheck);
        }
        catch(UserValidation_Exeption e)
        {
            System.out.println(e.getMessage());
            Assertions.assertEquals(UserValidation_Exeption.ExceptionType.INVALID_MOBILE_NUMBER, e.type);
        }
    }
    @Test
    void givenMobile_Validaiton_Fails_ReturnFalse()
    {
        try {
            boolean mobilecheck = junittesting.validamobile("91 2227569899");
            Assertions.assertFalse(mobilecheck);
            //System.out.println(emailcheck);
        }
        catch(UserValidation_Exeption e)
        {
            System.out.println(e.getMessage());
            Assertions.assertEquals(UserValidation_Exeption.ExceptionType.INVALID_MOBILE_NUMBER, e.type);
        }
    }
    //PASSWORD
    @Test
    void given_Password_Validaiton_Correct_ReturnTrue()
    {
        try {
            boolean passwordcheck = junittesting.validate_Password("Mrunal123");
            Assertions.assertTrue(passwordcheck);
        }
        catch(UserValidation_Exeption e)
        {
            System.out.println(e.getMessage());
            Assertions.assertEquals(UserValidation_Exeption.ExceptionType.INVALID_PASSWORD, e.type);
        }
    }
    @Test
    void given_Password_Validaiton_Fails_ReturnFalse()
    {
        try {
            boolean passwordcheck = junittesting.validate_Password("mrunal");
            Assertions.assertFalse(passwordcheck);
        }
        catch(UserValidation_Exeption e)
        {
            System.out.println(e.getMessage());
            Assertions.assertEquals(UserValidation_Exeption.ExceptionType.INVALID_PASSWORD, e.type);
        }
    }
}