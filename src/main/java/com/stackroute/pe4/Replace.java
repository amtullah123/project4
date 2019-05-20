package com.stackroute.pe4;

public class Replace {
        public String getReplace(String str)
        {
                //this statement replaces the old char with new char
        String new_str = str.replace('d', 'f');
        String s=new_str.replace('l', 't');
        //it returns the new string
        return s;
}
}
