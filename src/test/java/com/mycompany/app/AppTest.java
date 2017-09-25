package com.mycompany.app;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }



	public void testFound() {

      ArrayList<String> array = new ArrayList<>(Arrays.asList("ali", "ayse", "ssss", "adfsgghfg"));

      assertTrue(new App().search(array, 4 , 2));
    }

    public void testNotFound() {

      ArrayList<String> array = new ArrayList<>(Arrays.asList("mehmet", "ali", "dsafsegd", "sfsrısjsl"));

      assertFalse(new App().search(array, 0 , 1));
    }

    public void testEmptyArray() {

      ArrayList<String> array = new ArrayList<>();

      assertFalse(new App().search(array, 1 , 1));
    }

    public void testNull() {

      assertFalse(new App().search(null, 1 , 1));
    }

	public void testInput() { //a nın b den buyuk olup olmadıgını kontrol eder.. 

      ArrayList<String> array = new ArrayList<>(Arrays.asList("mehmet", "ali", "dsafsegd", "sfsrısjsl"));

	assertFalse(new App().search(array, 3 , 9));

	}
}
