
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

}