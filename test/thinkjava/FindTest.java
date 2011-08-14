/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package thinkjava;
import junit.framework.Assert.*;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.textui.TestRunner;
import thinkjava.Find;

/**
 *
 * @author karlo
 */
public class FindTest extends TestCase{
    public FindTest(String name){
        super(name);
    }
    public void testFind01(){
        int expected = 1;
        int[] a = {15,23,1,0,23,56,-1,101,456,23,12};
        int result = Find.findInElemCollection(a,23);
        assertEquals(expected,result);

    }
    public void testFind02(){
        int expected = 6;
        int[] a = {15,23,1,0,23,56,-1,101,456,23,12};
        int result = Find.findInElemCollection(a,-1);
        assertEquals(expected,result);

    }
    public void testFind03(){
        int expected = 10;
        int[] a = {15,23,1,0,23,56,-1,101,456,23,12};
        int result = Find.findInElemCollection(a,12);
        assertEquals(expected,result);

    }
    public static Test suite() { 
        TestSuite suite= new TestSuite(); 
        suite.addTest(new FindTest("testFind01"));
        suite.addTest(new FindTest("testFind02"));
        suite.addTest(new FindTest("testFind03"));
        return suite;
}
    public static void main(String[] args){
         TestRunner.run(suite());
    }

}
