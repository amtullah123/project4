package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeTest {
public static Transpose Transpose;
    @Before
    public void setUp() throws Exception {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        Transpose=new Transpose();
    }

    @After
    public void tearDown() throws Exception {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        Transpose=null;
    }

    @Test
    public void reverseWord() {
            String expected = "ym eman si lutma ";
        String actual=Transpose.reverseWord("my name is amtul");
        //This method checks the actual output with expected output.
            assertEquals(expected, actual);
    }

}