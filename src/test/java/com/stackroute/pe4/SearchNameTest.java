package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SearchNameTest {

        SearchName searchName;

        @Before
        public void setup(){
            // This methods runs, before running any one of the test case
            // This method is used to initialize the required variables
            searchName= new SearchName();
        }

        @After
        public void tearDown(){
            // This method runs, after running all the test cases
            // This method is used to clear the initialized variables
            searchName=null;
        }

        @Test
        public void NameSearcher_GivesBoolean_ShouldReturnTrue(){
            String str="I am Amtul";
            String name="Amtul";
            boolean result=searchName.NameSearcher(name,str);
            String condition="Is Amtul here? ";
            //this statement searches for the name and returns true
            assertTrue(condition,result);
            System.out.print("Is Amtul here? ");
            System.out.println(result);
        }


        @Test
        public void NameSearcher_GivesBoolean_ShouldReturnFalse(){
            String str="I am mahir";
            String name="Amtul";
            boolean result=searchName.NameSearcher(name,str);
            String condition="Is Amtul here? ";
            //this statement searches for the name and returns false
            assertFalse(condition,result);
            System.out.print("Is Amtul here? ");
            System.out.println(result);
        }

    }