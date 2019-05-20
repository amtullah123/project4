package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExtractWordsTest {
public static ExtractWords ExtractWords;

    @Before
    public void setUp() throws Exception {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        ExtractWords=new ExtractWords();

    }

    @After
    public void tearDown() throws Exception {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        ExtractWords=null;
    }

    @Test
        public void WordConversion_ArrayOfWords_ShouldReturnStringArray()
    {
            String str = "my name is amtul";
            String[] expected = {"amtul","is", "my", "name"};
            String[] result = ExtractWords.WordConversion(str);
        //This method checks the actual output with expected output.
            assertArrayEquals(expected, result);

    }
}