package junit;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class Junittest {

    public Junittesting junittesting = new Junittesting();
     String email;
     boolean finalResult;


    public Junittest(String email, boolean finalResult) {
        this.email = email;
        this.finalResult = finalResult;
    }
    @Parameters
        public static Collection emailData(){
            return  Arrays.asList ( new Object[][]{
                    { "mrunal@yahoo.com" ,true},
                    {"mrunal-100@yahoo.com",true},
                   {"mrunal.100@yahoo.com",true},
                    {"mrunal111@abc.com",true},
                    {"abc-100@abc.net",true},
                    {"abc.100@abc.com.au",true},
                    {"abc@1.com",true},
                    {"abc@gmail.com.com",true},
                    {"abc.100@1.com",true},
                    {"abc.abc@gmail.co.in",true},
                    {"abc100@gmail.com",true},
                    {"abc.100@abc.com.au",true},
                    {"abc@.com.my",false},
                    {"abc123@gmail.a",false},
                    {"abc",false},
                    {".abc@abc.com",false},
                    {"abc()*@gmail.com",false},
                    {"abc@%.com",false},
                    {"abc..2002@gmail.com",false},
                    {"abc.@g.com",false},
                    {"abc@abc@gmail.com",false},
                    {"abc@a.com.21a",false},
                    {"abc@g.cim.au.au",false},
                    {"abc@g.cim.au.au",false}

            });
        }
        @Test
        public void givenEmail_WhenValidOrInvalid_ReturnTrueOrFalse() {
            boolean result = junittesting.validateemail(this.email);
            Assertions.assertEquals(this.finalResult,result);
        }

}