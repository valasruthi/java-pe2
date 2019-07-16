package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    private Palindrome palindrome;
   @Before
    public void setUp() {
      this.palindrome=new Palindrome();
    }

    @After
    public void tearDown(){
       palindrome=null;
    }
    @Test
    public void givenIntegerShouldReturnErrorMessage(){
    int actualResult=palindrome.reverse(0);
    assertEquals(" ",actualResult);
    }
    @Test
    public void givenIntegerShouldReturnReverseNumber(){
       int actualResult=palindrome.reverse(121);
       assertEquals("121",actualResult);
    }
    @Test
    public void givenZeroShouldReturnNegativeNumber() {
        int actualResult=palindrome.reverse(-121);
        assertEquals( "negative number",actualResult);
    }
}