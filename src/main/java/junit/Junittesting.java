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


}
