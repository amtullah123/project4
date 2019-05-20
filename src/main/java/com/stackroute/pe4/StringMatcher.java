package com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringMatcher {
    public String matching(String inputString,String givenString)
    {
        StringBuffer stringBuffer=new StringBuffer();
        Pattern pattern=Pattern.compile(givenString,Pattern.CASE_INSENSITIVE);
        Matcher matcher=pattern.matcher(inputString);
        while (matcher.find())
        {
            //it finds the index of the given string
            stringBuffer.append("Found at: ").append(matcher.start()).append(" - ").append(matcher.end()).append("\n");
        }
        return stringBuffer.toString().trim();
    }
}
