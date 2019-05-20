package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringMatcherTest {
        StringMatcher stringMatcher;
        @Before
        public void setUp() throws Exception {
            // This methods runs, before running any one of the test case
            // This method is used to initialize the required variables
            stringMatcher=new StringMatcher();
        }

        @After
        public void tearDown() throws Exception {
            // This method runs, after running all the test cases
            // This method is used to clear the initialized variables
            stringMatcher=null;
        }

        @Test
        public void matching() {
            String expected="Found at: 4 - 6\n" +
                    "Found at: 10 - 12\n" +
                    "Found at: 27 - 29";
            String actual=stringMatcher.matching("She sells seashells by the seashore","se");
            //This method checks the actual output with expected output.
            assertEquals(expected,actual);
        }
        @Test
        public void matchingNotNull() {

            String actual=stringMatcher.matching("She sells seashells by the seashore","se");
            assertNotNull(actual);
        }
    }