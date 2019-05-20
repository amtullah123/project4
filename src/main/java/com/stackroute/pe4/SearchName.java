package com.stackroute.pe4;
import java.util.regex.*;
public class SearchName {

        public boolean NameSearcher(String name, String str){
            Pattern pattern = Pattern.compile(name);
            Matcher matcher = pattern.matcher(str);
            //this statement returns boolean result
            boolean result = matcher.find();
            return result;
        }

    }

