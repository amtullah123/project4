package com.stackroute.pe4;

public class CharCount {

    public int getCount(String str, char ch)
    {
        //if string is empty it returns -1
        if(str=="")
            return -1;
        //if string is empty it returns -1
        if(str==null)
            return -1;
        int charcount = str.length() - str.replaceAll("a", "").length();
        return charcount;

    }
}
