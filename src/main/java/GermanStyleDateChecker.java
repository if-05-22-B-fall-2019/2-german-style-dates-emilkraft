import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GermanStyleDateChecker {
    public static Matcher getMatcher(String dateString) {
        /**
         * ^ - beginning of a string or line
         * [\s-.] - ' ', '-' and '.' are valid delimeters
         * (19|20)? - 19 and 20 are valid centuries but are optional
         * $ - end of a string or line
         */
        String pattern = "^([1-9]|0[1-9]|[12][0-9]|3[01])[\\s-.]([1-9]|0[1-9]|1[012])[\\s-.](19|20)?\\d\\d$";

        // Create a Pattern object
        Pattern r = Pattern.compile(pattern);

        // Now create matcher object.
        return r.matcher(dateString);
    }
}
