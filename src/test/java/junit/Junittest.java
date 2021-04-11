
package junit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class Junittest {
    @Test
    void firstname() {
        Junittesting junittesting = new Junittesting();
        boolean fname = junittesting.validatefirstname("Mrunal");
        Assertions.assertTrue(fname);
        System.out.println(fname);
    }
    //FOR LASTNAME
    @Test
    public void lastName() {
        Junittesting junittesting = new Junittesting();
        Boolean lname = junittesting.validatelastName("Nagalwade");
        Assertions.assertTrue(lname);
        System.out.println(lname);
    }
    //for email
    @Test
    public void validateemail() {
        Junittesting junittesting = new Junittesting();
        Boolean emailcheck = junittesting.validateemail("mrunalnagalwade187@gmail.com");
        Assertions.assertTrue(emailcheck);
        System.out.println(emailcheck);
    }
    @Test
    public void validatemobile() {
        Junittesting junittesting = new Junittesting();
        Boolean mobilecheck = junittesting.validamobile("91 9804215182");
        Assertions.assertTrue(mobilecheck);
        System.out.println(mobilecheck);
    }

}