package com.javacode.test;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class NumberToWordConverterTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public NumberToWordConverterTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( NumberToWordConverterTest.class );
    }

    /**
     * Testing big number
     */
    public void testBigNumber()
    {
    	NumberToWordConverter converter = new NumberToWordConverter();
    	String word = converter.numberToWord(999999999);
    	String expectedString = "nine hundred ninety-nine million nine hundred ninety-nine thousand nine hundred ninety-nine";
    	assertTrue( word.equalsIgnoreCase(expectedString) );
    }
    /**
     * Testing negative number
     */
    public void testNegativeNumber()
    {
    	NumberToWordConverter converter = new NumberToWordConverter();
    	String word = converter.numberToWord(-889);
    	String expectedString = "minus eight hundred eighty-nine";
    	assertTrue( word.equalsIgnoreCase(expectedString) );
    }
    
    /**
     * Testing Zero
     */
    public void testZero()
    {
    	NumberToWordConverter converter = new NumberToWordConverter();
    	String word = converter.numberToWord(0);
    	String expectedString = "zero";
    	assertTrue( word.equalsIgnoreCase(expectedString) );
    }
    
    /**
     * Testing invalid number
     */
    public void testInvalidNumber()
    {
    	NumberToWordConverter converter = new NumberToWordConverter();
    	boolean error=false;
    	try {
    		converter.numberToWord(Integer.parseInt("ssd"));
    	}catch(NumberFormatException nme) {
    		error = true;
      	}
    	assertTrue(error);
    }
}
