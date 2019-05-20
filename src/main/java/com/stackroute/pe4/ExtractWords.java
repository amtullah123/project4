package com.stackroute.pe4;

public class ExtractWords {
        public String[] WordConversion(String str){
            //this statement splits the string into words
            String[] EWords=str.split(" ");
            int s=EWords.length;
            String temp="";

            for (int i = 0; i < s; i++)
            {
                for (int j = i + 1; j < s; j++)
                {
                    //this statement compares the word by word
                    if (EWords[i].compareTo(EWords[j])>0)
                    {
                        temp = EWords[i];
                        EWords[i] = EWords[j];
                        EWords[j] = temp;
                    }
                }
            }
            //it returns the words
            return EWords;


        }

    }
