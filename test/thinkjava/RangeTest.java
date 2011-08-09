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
import thinkjava.Range;

/**
 *
 * @author karlo
 */
public class RangeTest extends TestCase{
    public RangeTest(String name){
        super(name);
    }
    public void testMaxInRange01(){
        int expected = 5;
        int [] a = {1,2,3,4,5};
        int result = Range.maxInRange(a,0,4);
        assertEquals(expected,result);

    }
    public void testMaxInRange02(){
        int expected = 56;
        int[] a = {15,23,1,0,23,56,-1,101,456,23,12};
        int result = Range.maxInRange(a,2,5);
        assertEquals(expected,result);

    }
    public void testMaxInArray(){
        int expected = 456;
        int[] a = {15,23,1,0,23,56,-1,101,456,23,12};
        int result = Range.maxInArray(a);
        assertEquals(expected,result);

    }
    public static Test suite() { 
        TestSuite suite= new TestSuite(); 
        suite.addTest(new RangeTest("testMaxInRange01"));
        suite.addTest(new RangeTest("testMaxInRange02"));
        suite.addTest(new RangeTest("testMaxInArray"));
        return suite;
}
    public static void main(String[] args){
         TestRunner.run(suite());
    }

}
