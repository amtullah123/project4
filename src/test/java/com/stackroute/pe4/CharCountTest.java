package com.stackroute.pe4;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CharCountTest {
   public static CharCount charCount;

    @BeforeClass
    public static void setUp() throws Exception {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        charCount=new CharCount();
    }

    @AfterClass
    public static void tearDown() throws Exception {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        charCount=null;
    }

    @Test
    public void testGetCount() {
        assertEquals(-1,charCount.getCount("",'a'));
        assertEquals(-1,charCount.getCount(null,'a'));
        //this statement counts no of occurances of a
        assertEquals(7,charCount.getCount("abc abc aaaa bba",'a'));


    }
}