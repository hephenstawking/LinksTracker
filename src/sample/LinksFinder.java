package sample;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LinksFinder {

    public static List extractURL ( String str) {

        List<String> list = new ArrayList<>();

        String regex = "\\b((?:https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:, .;]*[-a-zA-Z0-9+&@#/%=~_|])";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(str);

        while (m.find()) {
            list.add(str.substring(m.start(0), m.end(0)));
        }

        if (list.size() == 0) {
            System.out.println("There is no links on this resource");
            return null;
        }

        return list;
    }
}
