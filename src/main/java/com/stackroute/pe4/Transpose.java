package com.stackroute.pe4;

public class Transpose {

    public String reverseWord(String str)
    {
        String[] words = str.split(" ");
        String reversedString = "";
        String reverseString="";
        for (int i = 0; i < words.length; i++)
        {
            //it checks for each n every word in the string
            String word = words[i];
            String reverseWord = "";
            for (int j = word.length() -1; j >= 0; j--)
            {
                reverseWord = reverseWord + word.charAt(j);
            }
            reversedString = reversedString + reverseWord + " ";

        }
        //it returns a reversed string
        return  reversedString;
    }
}

