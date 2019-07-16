package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentReportTest {
   private StudentReport studentReport;
    @Before
    public void setUp() throws Exception {
        this.studentReport=new StudentReport();
    }

    @After
    public void tearDown() throws Exception {
        studentReport=null;
    }
    @Test
    public void givenIntegerShouldReturnTheMininumNumber(){
        String actualResult=studentReport.studentDataSender(30);
        assertEquals("minimun number",actualResult);

    }
    @Test
    public void givenIntegerShouldReturnTheMaximumNumber(){
        String actualResult=studentReport.studentDataSender(95);
        assertEquals("maximum number",actualResult);
    }
    @Test
    public void givenIntegerShouldReturnTheAverage(){
        String actualResult=studentReport.studentDataSender(65);
        assertEquals("Average of the number",actualResult);

    }
    @Test
    public void givenNegativeNumberShouldReturnError(){
        String actualResult=studentReport.studentDataSender(-45);
        assertEquals("Number should not be negative",actualResult);

    }
    @Test
    public void givenNumberMoreThan100ShouldReturnError(){
        String actualResult=studentReport.studentDataSender(150);
        assertEquals("Number should not be greater than 100",actualResult);

    }
    @Test
    public void givenZeroShouldReturnErrorMessage(){
        String actualResult=studentReport.studentDataSender(0);
        assertEquals("Error",actualResult);
    }
}