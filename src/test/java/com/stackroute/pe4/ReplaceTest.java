package com.stackroute.pe4;

import org.junit.*;

import static org.junit.Assert.*;

public class ReplaceTest {
    public static Replace Replace;

    @Before
    public void setUp() throws Exception {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        Replace=new Replace();
    }

    @After
    public void tearDown() throws Exception {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        Replace=null;
    }

    @Test
    public void getReplace() {
        String expected = "faity fry";
        String actual=Replace.getReplace("daily dry");
        //This method checks the actual output with expected output.
        assertEquals(expected, actual);
    }

}